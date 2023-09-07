package com.ruhuna2.dependencyinjection.rest;

import com.ruhuna2.dependencyinjection.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DIDemoRestController {
    private Coach coach;

    @Autowired
    //search @Component, @Service, @Repository, @Controller, @RestController annotations with the type of Coach
    public DIDemoRestController(@Qualifier("basketBall") Coach thecoach) {
        this.coach = thecoach;
    }

    @GetMapping("/workout")
    String getDailyWorkout()
    {
        return coach.getDailyWorkout();
    }
}
