package ru.zerkalov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.zerkalov.springcourse.computer.Computer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);

        computer.streaming();
    }
}