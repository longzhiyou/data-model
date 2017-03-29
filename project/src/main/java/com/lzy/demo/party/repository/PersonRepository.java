package com.lzy.demo.party.repository;

import com.lzy.demo.party.domain.PersonEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:13
 */
public interface PersonRepository extends PagingAndSortingRepository<PersonEntity, Integer> {

    PersonEntity findByName(String name);

//    Page<PersonEntity> findAll(Specification<T> spec, Pageable pageable);  //分页按条件查询
//    List<PersonEntity> findAll(Specification<T> spec);    //不分页按条件查询

}
