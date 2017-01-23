package com.lzy.demo.party.repository;

import com.lzy.demo.party.domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:13
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

    PersonEntity findByName(String name);

}
