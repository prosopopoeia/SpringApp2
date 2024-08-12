package com.luv2code.springboot.demo.someapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @Value("${coach.name}")
    private String coachname;

    @Value("${team.name}")
    private String teamname;

    @Value("guppy")
    private String guppy;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachname + " TeamName: " + teamname + " gu: " + guppy;
    }

    // expose "/" endpoint -> returns Hell-o Kitty!
    @GetMapping("/")
    public String sayHello() {
        return "Hell-o Kitty!";
    }

    // ex[pse new endpoing for wkout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "run with the Kitty Committee";

    }
    //fortune endpoint
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
