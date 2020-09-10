package it.albertomosconi.designpatters.decorator;

public class CaramelAddon extends AddonDecorator {

    private final Beverage beverage;

    public CaramelAddon(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 2 + this.beverage.cost();
    }

    @Override
    public String description() {
        return this.beverage.description() + " + Caramel";
    }
}
