package it.albertomosconi.designpatters.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyingBehavior(new NoFlying());
        setQuackingBehavior(new UltrasonicQuacking());
    }
}
