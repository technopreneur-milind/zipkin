package com.technopreneur.milind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {

	private Logger logger = LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private Service service;

	@GetMapping("/message")
	public String message() {
		logger.info("message endpoint is invoked!");
		return service.invoke();
	}

}
