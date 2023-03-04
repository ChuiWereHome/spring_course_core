package ru.zerkalov.springcourse.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.zerkalov.springcourse.GenresMusic;
import ru.zerkalov.springcourse.music.Music;

import java.util.Random;

@Component
public class CdPlayer {
    private final Music danceMusic1;
    private final Music tripHopMusic1;

    @Autowired
    public CdPlayer(@Qualifier("danceMusic") Music danceMusic1,
                    @Qualifier("tripHopMusic") Music tripHopMusic1) {
        this.danceMusic1 = danceMusic1;
        this.tripHopMusic1 = tripHopMusic1;
    }

    public void play(GenresMusic genres) {
        int songNumber = new Random().nextInt(2 + 1);

        switch (genres) {
            case DANCE_MUSIC -> System.out.println(danceMusic1.getPlayList().get(songNumber));
            case TRIP_HOP_MUSIC -> System.out.println(tripHopMusic1.getPlayList().get(songNumber));
        }
    }
}