package com.phonebooker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PhonebookerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookerApplication.class, args);
	}

}
