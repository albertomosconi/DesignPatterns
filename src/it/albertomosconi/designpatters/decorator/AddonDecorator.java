package it.albertomosconi.designpatters.decorator;

public abstract class AddonDecorator extends Beverage {

    public abstract int cost();

    public abstract String description();
}
