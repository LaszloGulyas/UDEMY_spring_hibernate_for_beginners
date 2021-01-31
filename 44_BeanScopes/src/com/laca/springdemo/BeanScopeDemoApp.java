package com.laca.springdemo;

import com.laca.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    private static final String CONTEXT_FILE_NAME = "applicationContext.xml";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(CONTEXT_FILE_NAME);

        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach yourCoach = context.getBean("myCoach", Coach.class);

        boolean result = (myCoach == yourCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for myCoach: " + myCoach);
        System.out.println("\nMemory location for yourCoach: " + yourCoach);

        context.close();
    }
}
