package com.laca.springdemo.coach;

import com.laca.springdemo.service.FortuneService;

public class LolCoach implements Coach {

    private FortuneService fortuneService;

    private String team;

    public LolCoach(FortuneService fortuneService, String team) {
        this.fortuneService = fortuneService;
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Playing 100 games with Master Yi";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getTeam() {
        return team;
    }
}
