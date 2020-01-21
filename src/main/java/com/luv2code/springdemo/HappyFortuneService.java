package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("happy")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}