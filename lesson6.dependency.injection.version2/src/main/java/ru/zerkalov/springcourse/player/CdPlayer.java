package ru.zerkalov.springcourse.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.zerkalov.springcourse.music.Music;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class CdPlayer {
    private List<Music> musicList;
    private String model;
    private int volume;

    public void playList() {

        musicList.forEach(music ->
                System.out.println("Playing: " + music.getSong()));
    }
}