package org.spring.microservices.controller;

import org.spring.microservices.bean.LimitConfiguration;
import org.spring.microservices.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguratons() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
