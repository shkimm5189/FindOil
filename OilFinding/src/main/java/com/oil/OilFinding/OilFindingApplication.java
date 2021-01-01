package com.oil.OilFinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OilFindingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OilFindingApplication.class, args);
	}

}
