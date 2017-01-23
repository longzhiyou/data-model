package com.lzy;

import com.lzy.common.CustomJpaRepositoryFactoryBean;
import com.lzy.common.SoftDeletesRepositoryImpl;
import com.lzy.demo.party.MyRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = CustomJpaRepositoryFactoryBean.class)
//@EnableJpaRepositories(repositoryBaseClass = SoftDeletesRepositoryImpl.class)
//@EnableJpaRepositories(repositoryBaseClass = MyRepositoryImpl.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
