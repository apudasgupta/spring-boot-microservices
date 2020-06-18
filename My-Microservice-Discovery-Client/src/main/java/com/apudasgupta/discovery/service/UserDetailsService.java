package com.apudasgupta.discovery.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apudasgupta.discovery.model.EnvelopeResponse;
import com.apudasgupta.discovery.model.UserContactInfo;
import com.apudasgupta.discovery.model.UserDetail;
import com.apudasgupta.discovery.model.UserInfo;
import com.apudasgupta.discovery.model.UserInfos;

/**
 * @author Apu Das Gupta
 *
 */

@Service
public class UserDetailsService {

	@Autowired
	RestTemplate restTemplate;

	public List<UserDetail> getDetailsAll() {
		List<UserDetail> userDetails = new ArrayList<UserDetail>();
		String urlUserInfos = "http://user-info-service/userInfo/getAll";
		UserInfos userInfos = restTemplate.getForObject(urlUserInfos, UserInfos.class);
		List<UserInfo> userInfoList = userInfos.getUserInfoList();

		for (Iterator iterator = userInfoList.iterator(); iterator.hasNext();) {
			UserInfo userInfo = (UserInfo) iterator.next();
			UserContactInfo userContactInfo = restTemplate.getForObject("http://user-contact-service/userContact/getById?userId=" + userInfo.getId(), UserContactInfo.class);
			
			UserDetail userDetail = new UserDetail();
			userDetail.setId(userInfo.getId());
			userDetail.setName(userInfo.getName());
			userDetail.setEmail(userInfo.getEmail());
//			userDetail.setPhone(userContactInfo.getPhone());
//			userDetail.setAddress(userContactInfo.getAddress());
			userDetails.add(userDetail);
		}
		return userDetails;

	}

	public UserDetail getDetailsById(Long userId) {
//		String url="http://localhost:8091/user/getById?userId=2";
		String urlUserInfo = "http://user-info-service/userInfo/getById?userId=" + userId;
		UserInfo userInfo = restTemplate.getForObject(urlUserInfo, UserInfo.class);

		String urlUserContactInfo = "http://user-contact-service/userContact/getById?userId=" + userId;
		UserContactInfo userContactInfo = restTemplate.getForObject(urlUserContactInfo, UserContactInfo.class);

		UserDetail userDetail = new UserDetail();
		userDetail.setId(userInfo.getId());
		userDetail.setName(userInfo.getName());
		userDetail.setEmail(userInfo.getEmail());
		userDetail.setPhone(userContactInfo.getPhone());
		userDetail.setAddress(userContactInfo.getAddress());

		
		return userDetail;
	}

}
