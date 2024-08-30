package ru.zerkalov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping( "/")
    public String sayWelcome() {
        return "welcome";
    }
}