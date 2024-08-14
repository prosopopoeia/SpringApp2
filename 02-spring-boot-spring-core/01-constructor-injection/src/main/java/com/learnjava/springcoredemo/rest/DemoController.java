package com.learnjava.springcoredemo.rest;

import com.learnjava.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public void DemoController(
            @Qualifier("cricketCoach") Coach CCoach ) {
        myCoach =  CCoach;

        System.out.println("In ctor " + getClass().getSimpleName());


    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}






