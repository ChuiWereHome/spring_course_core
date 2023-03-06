package ru.zerkalov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.zerkalov.springcourse.computer.Computer;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);

        computer.streaming();

        System.out.printf("Player serial number = %s.\nVolume = %s",
                computer.getPlayer().getSerialNumber(),
                computer.getPlayer().getVolume());

        context.close();
    }
}