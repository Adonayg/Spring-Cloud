package com.adonayg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adonayg.domain.Cv;
import com.adonayg.service.CvService;

@RestController
@RequestMapping("/")
public class CvController {
	
	@Autowired
	private CvService service;

	@RequestMapping("/cvs")
	public List<Cv> getCvs() {
		return service.getAll();
	}
	
	@PostMapping("/add")
	public Cv addName(@RequestBody Cv cv) {
		return service.createCv(cv);
	}
}