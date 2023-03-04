package ru.zerkalov.springcourse.computer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.zerkalov.springcourse.player.CdPlayer;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class Computer {
    private final CdPlayer player;

    public void streaming() {
        this.player.play();
    }
}
