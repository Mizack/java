package com.miza.miza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MizaApplication {

	public static void main(String[] args) {
		Dotenv.configure().load();
		SpringApplication.run(MizaApplication.class, args);
	}

}
