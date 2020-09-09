package it.albertomosconi.designpatters.strategy;

public class MountainDuck extends Duck {
    public MountainDuck(){
        setFlyingBehavior(new DefaultFlying());
        setQuackingBehavior(new UltrasonicQuacking());
    }
}
