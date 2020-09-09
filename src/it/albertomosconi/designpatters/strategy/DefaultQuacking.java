package it.albertomosconi.designpatters.strategy;

public class DefaultQuacking implements IQuackingBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack default Quack");
    }
}
