package com.lzy;

import com.lzy.demo.party.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.Assert.assertEquals;

@Transactional
@Rollback(true)
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {

	}
	@Test
	public void testJpa() throws Exception {
		long count = personRepository.count();

		assertEquals(0, count);

	}

}
