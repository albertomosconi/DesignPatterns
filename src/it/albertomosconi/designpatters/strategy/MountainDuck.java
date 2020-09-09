package it.albertomosconi.designpatters.strategy;

import it.albertomosconi.designpatters.strategy.behavior.DefaultFlying;
import it.albertomosconi.designpatters.strategy.behavior.UltrasonicQuacking;

public class MountainDuck extends Duck {
    public MountainDuck(){
        setFlyingBehavior(new DefaultFlying());
        setQuackingBehavior(new UltrasonicQuacking());
    }
}
