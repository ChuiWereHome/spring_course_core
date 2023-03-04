package ru.zerkalov.springcourse.music;

import org.springframework.stereotype.Component;

@Component("tripHopMusicBean")
public class TripHopMusic implements Music {
    @Override
    public String getSong() {
        return "Gorillaz ::: Clint Eastwood";
    }
}