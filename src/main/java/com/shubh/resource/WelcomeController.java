package com.shubh.resource;

import org.jboss.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
	
	private static  org.slf4j.Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	@GetMapping(value="/greet/{name}")
	public String greetMsg(@PathVariable("name") String name) {
		logger.debug("start  method execution");
		logger.debug("end method execution");
		return "good evening:"+name;
	}
	
	

}
