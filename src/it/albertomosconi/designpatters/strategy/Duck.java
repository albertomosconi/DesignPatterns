package it.albertomosconi.designpatters.strategy;

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
