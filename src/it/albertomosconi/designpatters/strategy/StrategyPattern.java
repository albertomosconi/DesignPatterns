package it.albertomosconi.designpatters.strategy;

public class StrategyPattern {
    public void execute() {
        var cityDuck = new CityDuck();
        var mountainDuck  = new MountainDuck();
        var rubberDuck = new RubberDuck();
        cityDuck.fly();
        cityDuck.quack();
        mountainDuck.fly();
        mountainDuck.quack();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
