package com.learnjava.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//no scope, all Cricket Coach objects will be the same singleton
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("BaseballCoach: " + getClass().toString() + " " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {

        return "Practice Cactus";
    }
}
