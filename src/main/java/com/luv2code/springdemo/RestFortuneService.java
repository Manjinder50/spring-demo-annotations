package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("rest")
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Rest web service";
	}

}
