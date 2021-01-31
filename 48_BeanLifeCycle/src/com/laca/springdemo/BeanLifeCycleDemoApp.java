package com.laca.springdemo;

import com.laca.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    private static final String CONTEXT_FILE_NAME = "applicationContext.xml";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONTEXT_FILE_NAME);

        Coach myCoach = context.getBean("myCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout());

        context.close();
    }
}
