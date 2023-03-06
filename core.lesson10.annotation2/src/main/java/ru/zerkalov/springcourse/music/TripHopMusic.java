package ru.zerkalov.springcourse.music;

import org.springframework.stereotype.Component;

@Component
public class TripHopMusic implements Music {
    @Override
    public String getSong() {
        return "Gorillaz ::: Clint Eastwood";
    }
}