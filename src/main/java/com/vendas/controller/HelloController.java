package com.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	@Autowired
	@Qualifier("my_bean")
	private String valueFromClassConfiguration;

	@GetMapping("/hello")
	public String hello() {
		return valueFromClassConfiguration ;
	}
}
