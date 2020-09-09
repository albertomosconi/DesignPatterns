package it.albertomosconi.designpatters.strategy.behavior;

import it.albertomosconi.designpatters.strategy.behavior.IQuackingBehavior;

public class UltrasonicQuacking implements IQuackingBehavior {
    @Override
    public void quack() {
        System.out.println("ULTRASONIC QUACK");
    }
}
