package com.adonayg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.domain.Cv;
import com.adonayg.repository.CvRepository;

@Service
public class CvService {
	
	@Autowired
	private CvRepository cvRepo;
	
	public Cv createCv(Cv cv) {
		return cvRepo.save(cv);
	}
	
	public List<Cv> getAll() {
		return cvRepo.findAll();
	}


}
