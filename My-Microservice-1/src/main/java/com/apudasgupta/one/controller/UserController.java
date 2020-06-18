package com.apudasgupta.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apudasgupta.one.model.UserInfo;
import com.apudasgupta.one.model.UserInfos;
import com.apudasgupta.one.service.UserService;

/**
 * @author Apu Das Gupta
 *
 */

@RestController
@RequestMapping("/userInfo")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAll")
	public UserInfos getInfo(){
		return userService.getInfo();
	}
	
	@GetMapping("/getById")
	public UserInfo getById(@RequestParam Long userId){
		return userService.getById(userId);
	}
	
}
