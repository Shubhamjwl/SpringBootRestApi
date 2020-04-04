package com.shubh.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
	
	@GetMapping(value="/greet/{name}")
	public String greetMsg(@PathVariable("name") String name) {
		
		return "good evening:"+name;
	}
	
	

}
