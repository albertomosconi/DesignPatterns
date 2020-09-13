package it.albertomosconi.designpatters.strategy;

import it.albertomosconi.designpatters.Pattern;

public class StrategyPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("STRATEGY PATTERN");

        var cityDuck = new CityDuck();
        var mountainDuck  = new MountainDuck();
        var rubberDuck = new RubberDuck();

        cityDuck.fly();
        cityDuck.quack();
        mountainDuck.fly();
        mountainDuck.quack();
        rubberDuck.fly();
        rubberDuck.quack();

        System.out.println();
    }
}
