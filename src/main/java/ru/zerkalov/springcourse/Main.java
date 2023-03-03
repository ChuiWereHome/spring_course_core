package ru.zerkalov.springcourse;

import lombok.AllArgsConstructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        var a = context.getBean("harry", Harry.class);
        System.out.println("Name --> " + a.getName());
    }
}