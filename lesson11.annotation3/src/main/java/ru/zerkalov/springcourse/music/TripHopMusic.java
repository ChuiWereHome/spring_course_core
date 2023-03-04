package ru.zerkalov.springcourse.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TripHopMusic implements Music {
    private final List<String> playList = new ArrayList<>(List.of(
            "Shakira - Whenever, Wherever",
            "Gorillaz ::: Clint Eastwood",
            "50 Cent - Candy Shop"
    ));

    @Override
    public List<String> getPlayList() {
        return playList;
    }
}