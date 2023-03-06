package ru.zerkalov.springcourse.music;

import org.springframework.stereotype.Component;

@Component
public class DanceMusic implements Music {
    @Override
    public String getSong() {
        return "The Chemical Brothers ::: Galvanize";
    }
}