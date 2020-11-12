package it.albertomosconi.designpatters;

import it.albertomosconi.designpatters.abstractfactory.AbstractFactoryPattern;
import it.albertomosconi.designpatters.adapter.AdapterPattern;
import it.albertomosconi.designpatters.bridge.BridgePattern;
import it.albertomosconi.designpatters.command.CommandPattern;
import it.albertomosconi.designpatters.composite.CompositePattern;
import it.albertomosconi.designpatters.decorator.DecoratorPattern;
import it.albertomosconi.designpatters.facade.FacadePattern;
import it.albertomosconi.designpatters.factorymethod.FactoryMethodPattern;
import it.albertomosconi.designpatters.iterator.IteratorPattern;
import it.albertomosconi.designpatters.nullobject.NullObjectPattern;
import it.albertomosconi.designpatters.observer.ObserverPattern;
import it.albertomosconi.designpatters.proxy.ProxyPattern;
import it.albertomosconi.designpatters.singleton.SingletonPattern;
import it.albertomosconi.designpatters.state.StatePattern;
import it.albertomosconi.designpatters.strategy.StrategyPattern;
import it.albertomosconi.designpatters.templatemethod.TemplateMethodPattern;

public class Main {
    public static void main(String[] args){

        var abstractFactoryPattern = new AbstractFactoryPattern();
        abstractFactoryPattern.execute();

        var adapterPattern = new AdapterPattern();
        adapterPattern.execute();

        var bridgePattern = new BridgePattern();
        bridgePattern.execute();

        var commandPattern = new CommandPattern();
        commandPattern.execute();

        var compositePattern = new CompositePattern();
        compositePattern.execute();

        var decoratorPattern = new DecoratorPattern();
        decoratorPattern.execute();

        var facadePattern = new FacadePattern();
        facadePattern.execute();

        var factoryMethodPattern = new FactoryMethodPattern();
        factoryMethodPattern.execute();

        var iteratorPattern = new IteratorPattern();
        iteratorPattern.execute();

        var nullObjectPattern = new NullObjectPattern();
        nullObjectPattern.execute();

        var observerPattern = new ObserverPattern();
        observerPattern.execute();

        var proxyPattern = new ProxyPattern();
        proxyPattern.execute();

        var singletonPattern = new SingletonPattern();
        singletonPattern.execute();

        var statePattern = new StatePattern();
        statePattern.execute();

        var strategyPattern = new StrategyPattern();
        strategyPattern.execute();

        var templateMethodPattern = new TemplateMethodPattern();
        templateMethodPattern.execute();
    }
}
