package com.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vendas.Configuration.Animal;
import com.vendas.Configuration.Gato;

@SpringBootApplication
public class VendasApplication {


	@Autowired
	@Qualifier("cachorro")
	private Animal animal;
	

	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

	@Bean
	public CommandLineRunner executeAnimal() {
		return args ->{
			this.animal.fazerBarulho();
		};
	}
}
