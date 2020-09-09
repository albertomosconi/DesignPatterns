package it.albertomosconi.designpatters;

import it.albertomosconi.designpatters.decorator.DecoratorPattern;
import it.albertomosconi.designpatters.observer.ObserverPattern;
import it.albertomosconi.designpatters.strategy.StrategyPattern;

public class Main {
    public static void main(String[] args){

        var strategyPattern = new StrategyPattern();
        strategyPattern.execute();

        var observerPattern = new ObserverPattern();
        observerPattern.execute();

        var decoratorPattern = new DecoratorPattern();
        decoratorPattern.execute();
    }
}
