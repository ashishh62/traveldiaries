package com.traveldiaries.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traveldiaries.beans.UserDetailsRequestBean;
import com.traveldiaries.dao.UserDetailsDao;
import com.traveldiaries.mappers.UserDetailsMapper;
import com.traveldiaries.models.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired 
	private UserDetailsMapper userDetailsMapper;
	@Autowired
	private UserDetailsDao userDetailsDao;
	//@Autowired
	//private UserDetails userDetails;
	
	public String saveUserDetails(UserDetailsRequestBean reqBean) {
		UserDetails userDetails = new UserDetails();
		try{
			userDetailsMapper.userDetailsRequestMapper(reqBean, userDetails);
			userDetailsDao.saveUserDetails(userDetails);	
		}
		catch(Exception e){
			return "Failed";
		}
		return "Successful";
	}
}
