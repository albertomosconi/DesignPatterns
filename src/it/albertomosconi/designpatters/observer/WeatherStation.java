package it.albertomosconi.designpatters.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private int temperature;
    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver obs: observers)
            obs.update();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
