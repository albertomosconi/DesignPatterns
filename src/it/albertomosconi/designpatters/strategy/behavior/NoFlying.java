package it.albertomosconi.designpatters.strategy.behavior;

import it.albertomosconi.designpatters.strategy.behavior.IFlyingBehavior;

public class NoFlying implements IFlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}
