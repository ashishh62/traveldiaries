package com.traveldiaries.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.traveldiaries.models.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, String>{
	
	}
