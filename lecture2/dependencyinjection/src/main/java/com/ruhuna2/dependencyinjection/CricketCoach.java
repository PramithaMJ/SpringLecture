package com.ruhuna2.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
// we can say cricket coach is a type of coach as it implements coach interface
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice batting for 1 hours";
    }
}
