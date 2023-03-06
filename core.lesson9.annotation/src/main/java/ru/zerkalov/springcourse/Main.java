package ru.zerkalov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zerkalov.springcourse.music.Music;
import ru.zerkalov.springcourse.music.TripHopMusic;
import ru.zerkalov.springcourse.player.CdPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("tripHopMusicBean", TripHopMusic.class);

        CdPlayer cdPlayer = new CdPlayer(music);
        cdPlayer.play();

        context.close();
    }
}