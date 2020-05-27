package com.txconsole;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
	
	@GetMapping("/greet")
	public String greet() {
		
		System.out.println("LOG: Hello to all");
		return "Hello to all";
	}

}
