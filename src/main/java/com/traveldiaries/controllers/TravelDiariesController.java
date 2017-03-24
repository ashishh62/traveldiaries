package com.traveldiaries.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.traveldiaries.beans.UserDetailsRequestBean;
import com.traveldiaries.services.UserDetailsService;

@RestController
@RequestMapping(value="/api")
public class TravelDiariesController {
	
	@Autowired 
	private UserDetailsService userDetailsService;
	
	@RequestMapping(method=RequestMethod.POST, value="/saveuserdetails")
	public void saveUserDetails(@RequestBody UserDetailsRequestBean reqBean){
		try {
				userDetailsService.saveUserDetails(reqBean);
		}catch(Exception e){
			
		}
	}
}
