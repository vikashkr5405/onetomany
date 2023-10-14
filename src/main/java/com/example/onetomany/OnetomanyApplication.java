package com.example.onetomany;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJSONDoc

@SpringBootApplication
public class OnetomanyApplication
{

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

}
