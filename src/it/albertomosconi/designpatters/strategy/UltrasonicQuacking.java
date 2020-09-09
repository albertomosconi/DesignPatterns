package it.albertomosconi.designpatters.strategy;

public class UltrasonicQuacking implements IQuackingBehavior {
    @Override
    public void quack() {
        System.out.println("ULTRASONIC QUACK");
    }
}
