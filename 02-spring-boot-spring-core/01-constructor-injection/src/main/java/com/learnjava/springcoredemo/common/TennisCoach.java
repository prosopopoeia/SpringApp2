package com.learnjava.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {

        return "BackHand/Black Hand practice 30 min.";
    }
}