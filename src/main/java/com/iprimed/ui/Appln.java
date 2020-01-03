package com.iprimed.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iprimed.services.ICoach;

public class Appln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ICoach coach = context.getBean("cricketCoach",ICoach.class);
		
		ICoach coach = context.getBean("cricketCoach", ICoach.class);
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getFortune());
		
		context.close();

	}

}
