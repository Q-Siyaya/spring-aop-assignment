package com.springaop.implementation;

import com.springaop.interfaces.Speaker;
import com.springaop.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class SonnySpeakers implements Speaker {
    @Override
    public String makeSound(Song song) {
        return "Playing "+song.getTitle()+" by "+song.getSingerName()+
                " with sonny sperakers";
    }
}
