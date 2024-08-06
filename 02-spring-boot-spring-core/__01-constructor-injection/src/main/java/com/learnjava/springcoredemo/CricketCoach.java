package com.learnjava.springcoredemo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice cactus";
    }
//
//    @GetMapping("/dailyworkout")
//    public String getDailyWorkout() {
//        return myCoach.getDailyWorkout();
    }
}
