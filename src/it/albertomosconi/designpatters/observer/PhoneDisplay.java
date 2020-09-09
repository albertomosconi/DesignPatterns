package it.albertomosconi.designpatters.observer;

public class PhoneDisplay implements IObserver, IDisplay {
    private WeatherStation weatherStation;
    private int temperature;

    public PhoneDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("Phone Temp: " + temperature);
    }
}
