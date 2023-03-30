package com.folksdev.account_assesment;

import com.folksdev.account_assesment.model.Customer;
import com.folksdev.account_assesment.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class AccountAssesmentApplication implements CommandLineRunner {

	private final CustomerRepository customerRepository;

	public AccountAssesmentApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountAssesmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = customerRepository.save(new Customer("", "Batuhan", "Guven", new HashSet<>()));
		System.out.println(customer);
	}
}
