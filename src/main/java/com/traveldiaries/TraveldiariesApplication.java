package com.traveldiaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

import com.traveldiaries.hello.Customer;
import com.traveldiaries.hello.CustomerRepository;

@EnableAutoConfiguration(exclude = { EmbeddedMongoAutoConfiguration.class })
@SpringBootApplication
public class TraveldiariesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TraveldiariesApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository repository;
	
	
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Ashishggggg", "Smith"));
		repository.save(new Customer("Ankitgggg", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}

	}

}
