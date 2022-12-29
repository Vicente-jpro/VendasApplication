package com.vendas.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

	@Value("${test.message}")
	private String message;
	
	public CommandLineRunner showEnviroment() {
		return args -> {
			System.out.println(message);
		};
	}
}
