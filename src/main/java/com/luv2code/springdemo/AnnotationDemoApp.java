package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring conatiner
//		Coach coach = context.getBean("cricketCoach",Coach.class);
		Coach coach = context.getBean("tennisCoach",Coach.class);
//		Coach coach = context.getBean("tableTennisCoach", Coach.class);
	
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
