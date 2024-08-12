package com.learnjava.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach {
    @Override

    public String getDailyWorkout() {

        return "BackHand/Black Hand practice 30 min.";
    }
}