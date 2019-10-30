package com.jamf.now.interview.arithmetic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArithmeticApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ArithmeticApplication.class, args);
	}

	@Override
	public void run(final String... args) throws Exception {
		if (args.length != 3) {
			throw new IllegalArgumentException("Please provide three arguments.  An operation (+, - or *) then two numbers");
		}
	}
}
