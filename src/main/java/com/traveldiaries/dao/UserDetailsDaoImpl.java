package com.traveldiaries.dao;
import org.springframework.beans.factory.annotation.Autowired;
import com.traveldiaries.Repositories.UserDetailsRepository;
import com.traveldiaries.models.UserDetails;

public class UserDetailsDaoImpl implements UserDetailsDao {
	
	@Autowired
	private UserDetailsRepository repository;
	
	public void saveUserDetails(UserDetails details) {
		repository.save(details);
	}

}
