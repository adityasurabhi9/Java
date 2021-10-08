package com.learnspring.spring_one;

public class BaseballCoach implements Coach{
	// define a private field 
	
	private FortuneService fortuneService;
	
	// // define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	
	
	@Override
	public String getDailyworkout() {
		return "spend time practicing";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
