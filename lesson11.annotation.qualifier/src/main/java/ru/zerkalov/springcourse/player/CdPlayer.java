package ru.zerkalov.springcourse.player;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.zerkalov.springcourse.GenresMusic;
import ru.zerkalov.springcourse.music.Music;

import java.util.Random;

@Getter
@Setter
@Component
public class CdPlayer {

    private final int serialNumber;
    private final Music danceMusic1;
    private final Music tripHopMusic1;

    @Autowired
    public CdPlayer(@Qualifier("danceMusic") Music danceMusic1,
                    @Qualifier("tripHopMusic") Music tripHopMusic1,
                    @Value("${cd.player.serial.number}") int serialNumber) {
        this.danceMusic1 = danceMusic1;
        this.tripHopMusic1 = tripHopMusic1;
        this.serialNumber = serialNumber;
    }

    public void play(GenresMusic genres) {
        int songNumber = new Random().nextInt(2 + 1);

        switch (genres) {
            case DANCE_MUSIC -> System.out.println(danceMusic1.getPlayList().get(songNumber));
            case TRIP_HOP_MUSIC -> System.out.println(tripHopMusic1.getPlayList().get(songNumber));
        }
    }
}