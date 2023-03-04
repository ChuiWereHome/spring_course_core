package ru.zerkalov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zerkalov.springcourse.music.TripHopMusic;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TripHopMusic tripHopMusic = context.getBean("tripHopMusic", TripHopMusic.class);

        System.out.println(tripHopMusic.getSong());

        context.close();
    }
}