package ru.zerkalov.springcourse.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DanceMusic implements Music {
    private final List<String> playList = new ArrayList<>(List.of(
            "Crazy Town - Butterfly",
            "Eminem - Stan",
            "The Chemical Brothers ::: Galvanize"
    ));

    @Override
    public List<String> getPlayList() {
        return playList;
    }
}