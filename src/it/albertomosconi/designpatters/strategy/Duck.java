package it.albertomosconi.designpatters.strategy;

import it.albertomosconi.designpatters.strategy.behavior.IFlyingBehavior;
import it.albertomosconi.designpatters.strategy.behavior.IQuackingBehavior;

public class Duck {
    private IFlyingBehavior flyingBehavior;
    private IQuackingBehavior quackingBehavior;

    public void fly(){
        flyingBehavior.fly();
    }

    public void quack(){
        quackingBehavior.quack();
    }

    public void setFlyingBehavior(IFlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackingBehavior(IQuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }
}
