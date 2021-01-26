package com.laca.springdemo;

import com.laca.springdemo.coach.Coach;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

    private static final Log logger = LogFactory.getLog(HelloSpringApp.class);

    private static final String CONTEXT_FILE_NAME = "applicationContext.xml";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONTEXT_FILE_NAME);

        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println("\npractice: " + theCoach.getDailyWorkout());
        System.out.println("fortune: " + theCoach.getDailyFortune());
        System.out.println("team: " + theCoach.getTeam());

        theCoach = context.getBean("lolCoach", Coach.class);
        System.out.println("\npractice: " + theCoach.getDailyWorkout());
        System.out.println("fortune: " + theCoach.getDailyFortune());
        System.out.println("team: " + theCoach.getTeam());

        theCoach = context.getBean("trackCoach", Coach.class);
        System.out.println("\npractice: " + theCoach.getDailyWorkout());
        System.out.println("fortune: " + theCoach.getDailyFortune());
        System.out.println("team: " + theCoach.getTeam());

        context.close();
    }
}
