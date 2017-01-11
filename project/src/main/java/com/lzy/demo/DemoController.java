package com.lzy.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * User: longzhiyou
 * Date: 2016/11/4
 * Time: 13:33
 */
@RestController
@RequestMapping("/api")
public class DemoController {


    @RequestMapping("/party")
    public Greeting party() {
        return new Greeting(1,
                String.format("lzy", "party"));
    }


}
