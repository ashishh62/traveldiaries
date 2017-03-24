package com.traveldiaries.services;

import com.traveldiaries.beans.UserDetailsRequestBean;

public interface UserDetailsService {
	
	public String saveUserDetails(UserDetailsRequestBean reqBean);
}
