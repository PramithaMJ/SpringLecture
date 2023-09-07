package com.ruhuna2.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Coach{
    @Override
    public String getDailyWorkout() {
            return "Practice basketball for 1 hours";

    }
}
