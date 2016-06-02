package com.magic3group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class ApplicationStart {
	
	@RequestMapping("/")
	public @ResponseBody String sayHello()
	{
		return "Hello everyone, welcome to magic world!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}
}
