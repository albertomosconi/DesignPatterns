package it.albertomosconi.designpatters.observer;

import it.albertomosconi.designpatters.Pattern;

public class ObserverPattern implements Pattern {

    @Override
    public void execute() {
        System.out.println("OBSERVER PATTERN");

        var weatherStation = new WeatherStation();
        var androidPhoneDisplay = new PhoneDisplay();
        weatherStation.add(androidPhoneDisplay);
        var iOSPhoneDisplay = new PhoneDisplay();
        weatherStation.add(iOSPhoneDisplay);
        var tvDisplay = new TelevisionDisplay();
        weatherStation.add(tvDisplay);

        androidPhoneDisplay.display();
        iOSPhoneDisplay.display();
        tvDisplay.display();

        weatherStation.remove(iOSPhoneDisplay);
        weatherStation.setTemperature(100);

        androidPhoneDisplay.display();
        iOSPhoneDisplay.display();
        tvDisplay.display();

        System.out.println();
    }
}
