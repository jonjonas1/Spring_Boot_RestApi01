package com.springboot.api.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello My Dear the time is: " + LocalDateTime.now();
	}
	
	@GetMapping("/work")
	public String workout() {
		return "Doing very good exercises, Good Job";
	}
	
}
