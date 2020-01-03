package com.iprimed.services;

public class CricketCoachImpl implements ICoach {
	
	public IFortuneService fortuneService;
	
//	constructor injection
//	public CricketCoachImpl(IFortuneService fortuneService)
//	{
//		this.fortuneService=fortuneService;
//	}
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Do net practice for 1 hour";
	}
	

	//setter injection
	public void setFortuneService(IFortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
