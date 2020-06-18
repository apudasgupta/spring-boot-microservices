package com.apudasgupta.one.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.apudasgupta.one.model.UserInfo;
import com.apudasgupta.one.model.UserInfos;


/**
 * @author Apu Das Gupta
 *
 */

@Service
public class UserService {

	List<UserInfo> userInfoList;

	@PostConstruct
	private void initUsers() {
		userInfoList = Arrays.asList(new UserInfo(1L, "User One", "one@email.com"),
				new UserInfo(2L, "User Two", "two@email.com"));
		System.out.println("==> userInfo in microservice 1: " + userInfoList.toString());
	}

	public UserInfos getInfo() {
		UserInfos userInfos=new UserInfos();
		userInfos.setUserInfoList(userInfoList);
		return userInfos;
	}

	public UserInfo getById(Long userId) {

		return userInfoList.stream().filter(user -> (user.getId() == userId)).findAny().orElse(null);

	}

}
