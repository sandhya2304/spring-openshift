package com.sandhya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringTestOpenshift11Application
{

	@GetMapping(value="/")
	public String hello()
	{
		return "hello sandhya";
	}
	
	@GetMapping(value="/{name}")
	public String myName(@PathVariable String name)
	{
		return " hello "+name;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTestOpenshift11Application.class, args);
	}

}
