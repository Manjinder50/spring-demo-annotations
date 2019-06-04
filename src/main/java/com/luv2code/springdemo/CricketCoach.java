package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public CricketCoach(@Qualifier("happy")FortuneService fortuneService) {
		
		System.out.println("Cricket coach object initialised");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practise your straight drives";
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
