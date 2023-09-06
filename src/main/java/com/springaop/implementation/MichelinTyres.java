package com.springaop.implementation;

import com.springaop.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with the help of Michelin tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped moving with the help of Michelin tyres";
    }
}
