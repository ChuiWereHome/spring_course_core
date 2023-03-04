package ru.zerkalov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zerkalov.springcourse.player.CdPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        CdPlayer player = context.getBean("cdPlayer", CdPlayer.class);

        player.playList();

        System.out.println("Player model is - " + player.getModel());
        System.out.println("Player volume = " + player.getVolume());

        context.close();
    }
}