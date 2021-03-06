package com.traveldiaries.mappers;

import org.springframework.stereotype.Component;

import com.traveldiaries.beans.UserDetailsRequestBean;
import com.traveldiaries.models.UserDetails;

@Component
public class UserDetailsMapper {
	
	public void userDetailsRequestMapper(UserDetailsRequestBean userDetailsBean, UserDetails userDetails ) {
		
		userDetails.setFirstName(userDetailsBean.getFirstName());
		userDetails.setLastName(userDetailsBean.getLastName());
		userDetails.setDob(userDetailsBean.getDob());
		userDetails.setGender(userDetailsBean.getGender());
		userDetails.setEmailAddress(userDetailsBean.getEmailAddress());
		userDetails.setContactNumber(userDetailsBean.getContactNumber());
	}

}
