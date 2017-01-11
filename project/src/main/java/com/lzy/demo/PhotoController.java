package com.lzy.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Photo: longzhiyou
 * Date: 2016/11/4
 * Time: 16:09
 */
@RestController
@RequestMapping(value="/api/photos")     // 通过这里配置使下面的映射都在/photos下
public class PhotoController {

    // 创建线程安全的Map
    static Map<Integer, Photo> photos = Collections.synchronizedMap(new HashMap<Integer, Photo>(){
        {
            put(1, new Photo(1,"lzy"));
            put(2, new Photo(2,"long"));
        }
    });

    @RequestMapping(method= RequestMethod.GET)
    public List<Photo> index() {
        return new ArrayList<Photo>(photos.values());
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Photo show(@PathVariable Integer id) {

        return photos.get(id);
    }


    @RequestMapping(method=RequestMethod.POST)
    public Photo create(@ModelAttribute Photo photo) {

        Integer id = photos.size()+1;
        photo.setId(id);
        photos.put(id, photo);

        return photo;
    }



    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public Photo update(@PathVariable Integer id, @ModelAttribute Photo photo) {
        Photo u = photos.get(id);
        u.setName(photo.getName());
        photos.put(id, u);
        return u;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @ResponseStatus( HttpStatus.NO_CONTENT )

    public void destroy(@PathVariable Integer id, HttpServletResponse response) {
        photos.remove(id);
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return ;
    }


}