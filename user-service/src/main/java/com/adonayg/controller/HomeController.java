package com.adonayg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.adonayg.domain.User;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		
		return "Hello from User Service running at port: " + env.getProperty("local.server.port");
	}

	@RequestMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		User user = new User();
		user.setId(id);

		List<Object> cvs = restTemplate.getForObject("http://cv-service/cvs/", List.class);
		user.setCvs(cvs);

		return user;
	}

	@RequestMapping("/admin")
	public String homeAdmin() {
		return "This is the admin area of User service running at port: " + env.getProperty("local.server.port");
	}
}