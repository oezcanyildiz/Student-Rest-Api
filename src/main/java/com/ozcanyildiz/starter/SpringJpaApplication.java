package com.ozcanyildiz.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.ozcanyildiz")
@SpringBootApplication
@ComponentScan(basePackages = "com.ozcanyildiz")
@EnableJpaRepositories(basePackages = "com.ozcanyildiz.repository")
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
