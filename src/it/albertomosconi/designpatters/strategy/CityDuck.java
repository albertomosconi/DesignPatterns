package it.albertomosconi.designpatters.strategy;

public class CityDuck extends Duck {
    public CityDuck(){
       setFlyingBehavior(new DefaultFlying());
       setQuackingBehavior(new DefaultQuacking());
    }
}
