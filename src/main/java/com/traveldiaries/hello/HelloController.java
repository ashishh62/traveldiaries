package com.traveldiaries.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping(value="/hello")
	public String sayHi(){
		return "Hi";
	}
}

