package it.albertomosconi.designpatters;

import it.albertomosconi.designpatters.strategy.CityDuck;
import it.albertomosconi.designpatters.strategy.MountainDuck;
import it.albertomosconi.designpatters.strategy.RubberDuck;

public class Main {
    public static void main(String[] args){
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
