package com.revature.flashcard.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FlashcardConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardConfigServerApplication.class, args);
	}
}
