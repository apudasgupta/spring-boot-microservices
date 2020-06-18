package com.apudasgupta.two.model;

import lombok.Data;

/**
 * @author Apu Das Gupta
 *
 */

@Data
public class UserContactInfo {

	Long userId;
	String phone;
	String address;
	public UserContactInfo(Long userId, String phone, String address) {
		super();
		this.userId = userId;
		this.phone = phone;
		this.address = address;
	}
	
	
	
	
}
