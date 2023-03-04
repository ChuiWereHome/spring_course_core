package ru.zerkalov.springcourse.player;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.zerkalov.springcourse.music.Music;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CdPlayer {
    private final Music danceMusic;
    private final Music tripHopMusic;

    public void play() {
        System.out.println("Playing: " + this.danceMusic.getSong());
        System.out.println("Playing: " + this.tripHopMusic.getSong());
    }
}