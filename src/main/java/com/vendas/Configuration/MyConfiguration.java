package com.vendas.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean( name = "my_bean")
    public String configurationMethod() {
        return "This is a method for configuration";
    }
    
}
