package com.learnjava.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {

    public BaseballCoach(Coach theCoach) {
        System.out.println("BaseballCoach: " + getClass().toString() + " " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Batting practice 30 min.";

    }
}