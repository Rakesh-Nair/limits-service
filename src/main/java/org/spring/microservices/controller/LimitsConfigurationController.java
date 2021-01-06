package org.spring.microservices.controller;

import org.spring.microservices.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguratons() {
		return new LimitConfiguration(1000, 1);
	}
}
