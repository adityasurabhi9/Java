package com.learnspring.spring_one;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}
	
	@Override
	public String getDailyworkout() {
		return "run on the track";
	}

	@Override
	public String getDailyFortune() {
		return " just do it";
	}

}
