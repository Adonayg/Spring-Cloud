package com.adonayg.domain;

import java.util.List;

public class User {
	private Long id;
	private List<Object> cvs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Object> getCvs() {
		return cvs;
	}

	public void setCvs(List<Object> cvs) {
		this.cvs = cvs;
	}

}
