package com.springaop.services;

import com.springaop.interfaces.LogAspect;
import com.springaop.interfaces.Speaker;
import com.springaop.interfaces.Tyres;
import com.springaop.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices
{
    private Tyres tyres;
    private Speaker speaker;



    public String playMusic(boolean vehicleStarted, Song song)
    {
        return speaker.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStartde)
    {
        return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted)
    {
        return tyres.stop();
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Speaker getSpeaker() {
        return speaker;
    }


    @Autowired
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}
