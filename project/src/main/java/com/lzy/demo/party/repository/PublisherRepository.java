package com.lzy.demo.party.repository;

import com.lzy.demo.party.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:13
 */
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}
