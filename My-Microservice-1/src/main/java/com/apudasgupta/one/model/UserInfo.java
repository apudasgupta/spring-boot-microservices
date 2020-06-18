package com.apudasgupta.one.model;

import lombok.Data;

/**
 * @author Apu Das Gupta
 *
 */

@Data
public class UserInfo {
	
	private Long id;
	
	private String name;
	
	private String email;

	
	public UserInfo(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	
}
