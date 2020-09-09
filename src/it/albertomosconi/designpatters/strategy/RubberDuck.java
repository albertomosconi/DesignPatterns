package it.albertomosconi.designpatters.strategy;

import it.albertomosconi.designpatters.strategy.behavior.NoFlying;
import it.albertomosconi.designpatters.strategy.behavior.UltrasonicQuacking;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyingBehavior(new NoFlying());
        setQuackingBehavior(new UltrasonicQuacking());
    }
}
