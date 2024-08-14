package com.learnjava.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {


    public TrackCoach() {
        System.out.println("BaseballCoach: " + getClass().toString() + " " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {

        return "Run! 30 min.";
    }
}