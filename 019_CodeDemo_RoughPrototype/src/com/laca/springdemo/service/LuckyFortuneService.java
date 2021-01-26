package com.laca.springdemo.service;

import java.util.Random;

public class LuckyFortuneService implements FortuneService {

    private static final Random random = new Random();

    private static final String[] luckyMessages = {
            "you have a SUPER lucky day!",
            "buy a lottery ticket NOW!",
            "best day of your life!"};

    @Override
    public String getFortune() {
        return luckyMessages[random.nextInt(luckyMessages.length)];
    }
}
