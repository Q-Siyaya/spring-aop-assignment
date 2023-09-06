package com.springaop.main;

import com.springaop.config.ProjectConfig;
import com.springaop.model.Song;
import com.springaop.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exampe17
{
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices=context.getBean(VehicleServices.class);

        Song song=new Song();
        song.setTitle("son title");
        song.setSingerName("Tyler swift");
        boolean vehicleStarted=true;


        String music=vehicleServices.playMusic(vehicleStarted,song);
        System.out.println(music);
        System.out.println(vehicleServices);
    }
}
