package ru.lechif.HiChatDden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing(auditorAwareRef = "ApplicationAuditorAware")
public class HiChatDdenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiChatDdenApplication.class, args);
	}

}
