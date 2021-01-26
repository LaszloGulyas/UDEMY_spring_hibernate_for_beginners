package com.laca.springdemo.coach;

import com.laca.springdemo.service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String team;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getTeam() {
        return team;
    }
}
