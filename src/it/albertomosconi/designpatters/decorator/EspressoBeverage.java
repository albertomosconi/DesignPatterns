package it.albertomosconi.designpatters.decorator;

public class EspressoBeverage extends Beverage {
    @Override
    public int cost() {
        return 1;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
