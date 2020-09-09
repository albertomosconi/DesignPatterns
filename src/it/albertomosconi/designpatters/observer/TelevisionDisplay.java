package it.albertomosconi.designpatters.observer;

public class TelevisionDisplay implements IObserver, IDisplay {

    private WeatherStation weatherStation;
    private int temperature;

    public TelevisionDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        this.temperature = this.weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("TV Temp: " + temperature);
    }
}
