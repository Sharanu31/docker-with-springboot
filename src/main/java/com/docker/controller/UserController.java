package com.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-with-springboot")
public class UserController {

	@Autowired
	private Environment environment;

	@GetMapping
	public String returnString() {
		return "Spring Boot With Docker";
	}

	@GetMapping("/environment")
	public String getEnvironment() {
		String[] activeProfiles = environment.getActiveProfiles();
		if (activeProfiles.length == 0) {
			return "No active profiles";
		}
		return "Active environment: " + String.join(", ", activeProfiles);
	}
}
