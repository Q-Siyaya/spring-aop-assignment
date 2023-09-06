package com.springaop.implementation;

import com.springaop.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with help of BridgeStone tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped moving with help of BridgeStone tyres";
    }
}
