package com.txconsole;

import java.net.MalformedURLException;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloUIController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value = {"/", "/index"})
	public String index(Model model, HttpServletRequest request) throws MalformedURLException {
		log.info("Homme page is triggered..!");
		return "index";
	}

}
