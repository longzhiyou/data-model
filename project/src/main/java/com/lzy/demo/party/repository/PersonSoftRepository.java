package com.lzy.demo.party.repository;

import com.lzy.common.SoftDeletesRepository;
import com.lzy.demo.party.domain.PersonEntity;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:13
 */
public interface PersonSoftRepository extends SoftDeletesRepository<PersonEntity, Integer> {

    List<PersonEntity> findByName(String name);

}
