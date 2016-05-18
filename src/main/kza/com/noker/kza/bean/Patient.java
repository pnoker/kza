package com.noker.kza.bean;

import com.noker.kza.model.User;

public class Patient extends User {
	private Integer role;

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}
