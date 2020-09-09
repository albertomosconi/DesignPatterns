package it.albertomosconi.designpatters.observer;

public class PhoneDisplay implements IObserver, IDisplay {
    private WeatherStation weatherStation;
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("Phone Temp: " + temperature);
    }
}
