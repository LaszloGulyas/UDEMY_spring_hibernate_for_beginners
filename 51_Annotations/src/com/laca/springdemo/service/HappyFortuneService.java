package com.laca.springdemo.service;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "today is your lucky day";
    }
}
