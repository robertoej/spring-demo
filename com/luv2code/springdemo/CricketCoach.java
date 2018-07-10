package com.luv2code.springdemo;

import com.luv2code.springdemo.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Inside no-arg CricketCoach constructor.");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setFortuneService CricketCoach constructor.");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}