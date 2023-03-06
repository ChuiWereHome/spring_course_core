package ru.zerkalov.springcourse.computer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.zerkalov.springcourse.GenresMusic;
import ru.zerkalov.springcourse.player.CdPlayer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Computer {
    private final CdPlayer player;

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing computer initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("\nDoing computer destruction");
    }

    public void streaming() {
        this.player.play(GenresMusic.TRIP_HOP_MUSIC);
    }
}