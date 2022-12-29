package com.vendas.Configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean( name = "my_configuration")
	public String myConfiguration() {
		return "This is how do you configure your app.";
	}
}
