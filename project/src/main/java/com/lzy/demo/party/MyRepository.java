package com.lzy.demo.party;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * User: longzhiyou
 * Date: 2017/1/17
 * Time: 19:04
 */
@NoRepositoryBean
public interface MyRepository<T, ID extends Serializable>
        extends PagingAndSortingRepository<T, ID> {

    void sharedCustomMethod(ID id);
}