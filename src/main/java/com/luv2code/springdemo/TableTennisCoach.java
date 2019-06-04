package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {

	@Autowired
	@Qualifier("rest")
	private FortuneService fortuneService;
	
	
	public TableTennisCoach() {
		
		System.out.println("table tennis bean initialized");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practise topspin forehand against slice";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
