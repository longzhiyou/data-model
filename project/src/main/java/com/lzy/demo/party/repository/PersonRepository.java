package com.lzy.demo.party.repository;

import com.lzy.demo.party.domain.PersonEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 处方通知仓库
 * User: longzhiyou
 * Date: 2016/11/8
 * Time: 20:04
 */
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {


}
