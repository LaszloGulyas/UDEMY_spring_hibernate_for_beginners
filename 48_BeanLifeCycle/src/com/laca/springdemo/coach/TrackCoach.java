package com.laca.springdemo.coach;

import com.laca.springdemo.service.FortuneService;
import org.springframework.stereotype.Component;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String team;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void init() {
        System.out.println("TrackCoach init called...");
    }

    public void destroy() {
        System.out.println("TrackCoach destroy called...");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
