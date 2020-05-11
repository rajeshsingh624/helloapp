package com.txconsole;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String greet() {
		
		System.out.println("LOG: Hello to all");
		return "Hello to all";
	}

}
