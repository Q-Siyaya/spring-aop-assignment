package com.springaop.implementation;

import com.springaop.interfaces.Speaker;
import com.springaop.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {
    @Override
    public String makeSound(Song song) {
        return "Playing "+song.getTitle()+" by "+song.getSingerName()
                +" with boss speakers.";
    }
}
