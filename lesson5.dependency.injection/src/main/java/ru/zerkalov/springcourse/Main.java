package ru.zerkalov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zerkalov.springcourse.player.CdPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml");

        CdPlayer player = context.getBean("cdPlayer", CdPlayer.class);

        player.play();

        context.close();
    }
}