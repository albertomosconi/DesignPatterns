package it.albertomosconi.designpatters.observer;

public class TelevisionDisplay implements IObserver, IDisplay {

    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("TV Temp: " + temperature);
    }
}
