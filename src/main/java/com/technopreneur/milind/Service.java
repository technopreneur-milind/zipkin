package com.technopreneur.milind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.micrometer.tracing.annotation.NewSpan;

@Component
public class Service {
	private Logger logger = LoggerFactory.getLogger(Service.class);
	
	private final RestTemplate restTemplate;
	
	public Service(final RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String invoke() {
		logger.info("Inside service.invoke method!");
		return this.restTemplate.getForObject("http://localhost:9090/backend/message", String.class);
		
	}

}
