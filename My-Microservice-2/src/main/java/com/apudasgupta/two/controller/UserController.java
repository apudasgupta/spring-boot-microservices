package com.apudasgupta.two.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apudasgupta.two.model.UserContactInfo;
import com.apudasgupta.two.model.UserContactInfos;
import com.apudasgupta.two.service.UserService;

/**
 * @author Apu Das Gupta
 *
 */

@RestController
@RequestMapping("/userContact")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/getAll")
	public UserContactInfos contactInfo() {
		return userService.getContactInfo();

	}

	@GetMapping("/getById")
	public UserContactInfo getContactInfoById(@RequestParam Long userId) {
		return userService.getContactInfoById(userId);

	}
}
