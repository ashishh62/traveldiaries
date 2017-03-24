package com.traveldiaries;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;


@EnableAutoConfiguration (exclude = { EmbeddedMongoAutoConfiguration.class })
@SpringBootApplication(scanBasePackages={"com"})
public class TraveldiariesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraveldiariesApplication.class, args);
	}
}
