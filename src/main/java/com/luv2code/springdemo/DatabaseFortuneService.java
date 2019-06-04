package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("database")
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Returns database values";
	}

}
