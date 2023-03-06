package ru.zerkalov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.zerkalov.springcourse")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
