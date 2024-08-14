package com.learnjava.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("cricketCoach: " + getClass().toString() + " " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "BackHand/Black Hand practice 30 min.";
    }
}