package com.lzy;

import com.lzy.common.DateTimeService;
import com.lzy.demo.party.domain.Book;
import com.lzy.demo.party.domain.PersonEntity;
import com.lzy.demo.party.repository.BookRepository;
import com.lzy.demo.party.repository.PersonRepository;
import com.lzy.demo.party.repository.PersonSoftRepository;
import com.lzy.demo.party.repository.PublisherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.ZonedDateTime;
import java.util.List;

//@Transactional

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);


	@Autowired
	DateTimeService dateTimeService;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private PublisherRepository publisherRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	PersonSoftRepository personSoftRepository;


	@Test
	public void contextLoads() {

	}
	@Test
	@Transactional
	@Rollback(false)
	public void testJpa() throws Exception {


//		final Book bookA = new Book("Book A");
//		final Book bookB = new Book("Book B");
//		bookRepository.save(bookA);
//		bookRepository.save(bookB);
//
//		// save a couple of books
//		final Publisher publisherA = new Publisher("Publisher A");
//		final Publisher publisherB = new Publisher("Publisher B");
//		final Publisher publisherC = new Publisher("Publisher C");
//		publisherRepository.save(publisherA);
//		publisherRepository.save(publisherB);
//		publisherRepository.save(publisherC);

//		Book bookA = bookRepository.findOne(20);
//		Book bookB = bookRepository.findOne(21);

//		final Publisher publisherA = publisherRepository.findOne(32);
//		final Publisher publisherB = publisherRepository.findOne(33);
//		final Publisher publisherC = publisherRepository.findOne(34);
//
//		HashSet<Publisher> publishers = new HashSet<>();
//		publishers.add(publisherA);
//		publishers.add(publisherB);
//		publishers.add(publisherC);
//		bookB.setPublishers(publishers);
//		bookRepository.save(bookB);


//		PersonEntity personNew = new PersonEntity();
//		personNew.setName("lzy-delete-test");
//		personNew.setDeleteFlag(0);
//		personRepository.save(personNew);
//		PersonEntity person = personRepository.findOne(3);
//		person.setName("change delete");
//		personRepository.save(person);

//		List<PersonEntity> personEntities = personSoftRepository.findByName("lzy");

//		long countActive = personSoftRepository.countActive();


		PersonEntity entity = personSoftRepository.findOne(2);

//		PersonEntity person = personRepository.findByName("lzy11");


		Book bookA = bookRepository.findOne(21);
//		ZonedDateTime currentDateAndTime = dateTimeService.getCurrentDateAndTime();
		bookRepository.delete(20);


//		bookRepository.save(new HashSet<Book>(){{
//			add(new Book("Book A", new HashSet<Publisher>(){{
//				add(publisherA);
//				add(publisherB);
//			}}));
//
//			add(new Book("Book B", new HashSet<Publisher>(){{
//				add(publisherA);
//				add(publisherC);
//			}}));
//		}});
//
//		// fetch all books
//		for(Book book : bookRepository.findAll()) {
//			logger.info(book.toString());
//		}
//
//		// save a couple of publishers
//		final Book bookA = new Book("Book A");
//		final Book bookB = new Book("Book B");
//		publisherRepository.save(new HashSet<Publisher>() {{
//			add(new Publisher("Publisher A", new HashSet<Book>() {{
//				add(bookA);
//				add(bookB);
//			}}));
//
//			add(new Publisher("Publisher B", new HashSet<Book>() {{
//				add(bookA);
//				add(bookB);
//			}}));
//		}});
//
//		// fetch all publishers
//		for(Publisher publisher : publisherRepository.findAll()) {
//			logger.info(publisher.toString());
//		}


//		long count = personRepository.count();
//
//		PersonEntity personEntity = new PersonEntity();
//		personEntity.setTenantId(2);
//
//		personRepository.save(personEntity);
//		count = personRepository.count();

//		assertEquals(2, count);

	}

}
