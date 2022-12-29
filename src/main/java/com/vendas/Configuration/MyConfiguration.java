package com.vendas.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class MyConfiguration {
	
	@Bean( name = "my_configuration")
	public String myConfiguration() {
		return "This is how do you configure your app.";
	}
	
	@Bean
	public CommandLineRunner execut() {
		return args -> {
			System.out.println("\n EXECUTING IN PRODUCTION ENVIROMENT \n ");
		};
	}
}
