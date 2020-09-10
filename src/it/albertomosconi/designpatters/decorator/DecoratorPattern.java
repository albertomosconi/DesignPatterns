package it.albertomosconi.designpatters.decorator;

public class DecoratorPattern {
    public void execute(){
        var espresso = new EspressoBeverage();
        System.out.println(espresso.description());
        System.out.println(espresso.cost());
        var caramelEspresso = new CaramelAddon(espresso);
        System.out.println(caramelEspresso.description());
        System.out.println(caramelEspresso.cost());
    }
}
