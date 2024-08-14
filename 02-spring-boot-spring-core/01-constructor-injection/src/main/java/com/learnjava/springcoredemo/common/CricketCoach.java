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
    //init method for bean - runs each time a bean is created
    @PostConstruct
    public void startUpStuff() {
        System.out.println("init method:  " + getClass().getSimpleName());
    }

    // destroy method - runs when the bean is disposed of
    // important to remember, Beans with prototype scope will NOT run destroy method
    // the Bean is created and handed off and THAT IS IT
    @PreDestroy
    public void cleanUpStuff() {
        System.out.println("destroy method:  " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {

        return "Practice Cactus";
    }
}
