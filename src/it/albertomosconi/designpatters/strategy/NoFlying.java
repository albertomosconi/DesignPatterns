package it.albertomosconi.designpatters.strategy;

public class NoFlying implements IFlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}
