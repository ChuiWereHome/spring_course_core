package ru.zerkalov.springcourse.player;

import lombok.AllArgsConstructor;
import ru.zerkalov.springcourse.music.Music;

@AllArgsConstructor
public class CdPlayer {
    private Music music;

    public void play() {
        System.out.println("Playing: " + this.music.getSong());
    }
}
