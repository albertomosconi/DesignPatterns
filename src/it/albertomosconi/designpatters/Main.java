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

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pattern> patterns = new ArrayList<>(Arrays.asList(
                new AbstractFactoryPattern(),
                new AdapterPattern(),
                new BridgePattern(),
                new CommandPattern(),
                new CompositePattern(),
                new DecoratorPattern(),
                new FacadePattern(),
                new FactoryMethodPattern(),
                new IteratorPattern(),
                new NullObjectPattern(),
                new ObserverPattern(),
                new ProxyPattern(),
                new SingletonPattern(),
                new StatePattern(),
                new StrategyPattern(),
                new TemplateMethodPattern()
        ));

        Scanner scanner = new Scanner(System.in);
        String choice = "h";
        while (!choice.equals("q")) {

            if (choice.equals("h")) {
                System.out.println("DESIGN PATTERN IMPLEMENTATION EXAMPLES");
                System.out.println("By Alberto Mosconi - 2020\n");
                System.out.println("Choose one of the numbers below to see the output of the corresponding example.");
                System.out.println("Input 'h' to see this menu, and 'q' to quit.");
                for (int i = 0; i < patterns.size(); i++) {
                    String p = patterns.get(i).toString();
                    System.out.println(i + 1 + ": " + p);
                }
            } else {
                try {
                    if (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < patterns.size() + 1) {
                        patterns.get(Integer.parseInt(choice) - 1).execute();
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Unknown command. Please enter 'h' to see all available commands.");
                }
            }

            System.out.print("> ");
            choice = scanner.nextLine();
        }
    }
}
