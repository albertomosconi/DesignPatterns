package it.albertomosconi.designpatters.decorator;

import it.albertomosconi.designpatters.Pattern;

public class DecoratorPattern implements Pattern {
    @Override
    public void execute(){
        System.out.println("DECORATOR PATTERN");

        var espresso = new EspressoBeverage();
        System.out.println(espresso.description());
        System.out.println(espresso.cost());

        var caramelEspresso = new CaramelAddon(espresso);

        System.out.println(caramelEspresso.description());
        System.out.println(caramelEspresso.cost());

        System.out.println();
    }

    @Override
    public String toString() {
        return "Decorator Pattern";
    }
}
