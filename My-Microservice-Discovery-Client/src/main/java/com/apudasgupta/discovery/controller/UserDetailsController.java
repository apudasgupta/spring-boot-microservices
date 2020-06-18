package com.apudasgupta.discovery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apudasgupta.discovery.model.UserDetail;
import com.apudasgupta.discovery.service.UserDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author Apu Das Gupta
 *
 */

@RestController
@RequestMapping("/user")
@Api(tags = "User",description = "Access to User Details")
public class UserDetailsController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	
	@GetMapping("/getDetailsAll")
	@ApiOperation(value = "Get Details of all users",notes = "All user information",response = UserDetail.class)
	public List<UserDetail> getDetailsAll() {
		return userDetailsService.getDetailsAll();
	}
	
	@GetMapping("/getDetailsById")
	@ApiOperation(value = "Find Details by id",notes = "Provide an id to find specific user info",response = UserDetail.class)
	public UserDetail getDetailsById(@RequestParam Long userId) {
		return userDetailsService.getDetailsById(userId);
	}

}
