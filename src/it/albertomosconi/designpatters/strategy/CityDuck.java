package it.albertomosconi.designpatters.strategy;

import it.albertomosconi.designpatters.strategy.behavior.DefaultFlying;
import it.albertomosconi.designpatters.strategy.behavior.DefaultQuacking;

public class CityDuck extends Duck {
    public CityDuck(){
       setFlyingBehavior(new DefaultFlying());
       setQuackingBehavior(new DefaultQuacking());
    }
}
