package com.txconsole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/greet")
	public String greet() {
		
		log.info("LOG: Hello to all");
		return "Hello to all";
	}

}
