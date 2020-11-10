package it.albertomosconi.designpatters;

import it.albertomosconi.designpatters.abstractfactory.AbstractFactoryPattern;
import it.albertomosconi.designpatters.command.CommandPattern;
import it.albertomosconi.designpatters.decorator.DecoratorPattern;
import it.albertomosconi.designpatters.factorymethod.FactoryMethodPattern;
import it.albertomosconi.designpatters.observer.ObserverPattern;
import it.albertomosconi.designpatters.singleton.SingletonPattern;
import it.albertomosconi.designpatters.strategy.StrategyPattern;

public class Main {
    public static void main(String[] args){

        var strategyPattern = new StrategyPattern();
        strategyPattern.execute();

        var observerPattern = new ObserverPattern();
        observerPattern.execute();

        var decoratorPattern = new DecoratorPattern();
        decoratorPattern.execute();

        var factoryMethodPattern = new FactoryMethodPattern();
        factoryMethodPattern.execute();

        var abstractFactoryPattern = new AbstractFactoryPattern();
        abstractFactoryPattern.execute();

        var singletonPattern = new SingletonPattern();
        singletonPattern.execute();

        var commandPattern = new CommandPattern();
        commandPattern.execute();
    }
}
