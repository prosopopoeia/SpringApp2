package com.learnjava.springcoredemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    public BaseballCoach() {
        System.out.println("BaseballCoach: " + getClass().toString() + " " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {

        return "Batting practice 30 min.";

    }
}