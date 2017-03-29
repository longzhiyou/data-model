package com.lzy.demo.party.controller;


import com.lzy.demo.party.domain.PersonEntity;
import com.lzy.demo.party.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.*;
import javax.validation.Valid;
import java.util.List;

/**
 * 健康评估主控制器
 * Date: 2016/11/4
 * Time: 16:09
 */
@RestController
public class PersonController {


    @Autowired
    PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET,value = "/person")
    public List<PersonEntity> index() {

       return (List<PersonEntity>) personRepository.findAll();

    }

    public Predicate toPredicate(Root<PersonEntity> root,CriteriaQuery<?> query, CriteriaBuilder cb) {
        Path<String> namePath = root.get("name");
        Path<String> nicknamePath = root.get("nickname");
        /**
         * 连接查询条件, 不定参数，可以连接0..N个查询条件
         */
        query.where(cb.like(namePath, "%李%"), cb.like(nicknamePath, "%王%")); //这里可以设置任意条查询条件

        return null;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/personAge")
    public Page<PersonEntity> indexPage(@RequestParam(value="name", required=false) String name,Pageable pageable
            ) {

        Page<PersonEntity> testPages = personRepository.findAll(pageable);

        return testPages;

        //排序对象
//        Sort sort = new Sort(Sort.Direction.fromString("desc"), "createdAt");
//        Pageable pageable = new PageRequest(page, pageSize, sort);
//
//        PageResult<TestPage> pageResult = testService.list(true, pageable);
//
//        personRepository.findAll(Specification<T> spec, Pageable pageable);  //分页按条件查询
//         PageResult<PersonEntity> pageResult = personRepository.findAll();

    }

    @RequestMapping(method= RequestMethod.POST,consumes = "application/json",value = "/person")
    @ResponseStatus(HttpStatus.OK )
//    public void create(@Valid  @RequestBody PersonEntity personEntity,BindingResult result) {
    public void create(@Valid  @RequestBody PersonEntity personEntity) {


//        result.rejectValue("name", "misFormat", "这个name已经注册过了！");
		personRepository.save(personEntity);

    }



}