package it.albertomosconi.designpatters.strategy.behavior;

public class DefaultFlying implements IFlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Flying Normally");
    }
}
