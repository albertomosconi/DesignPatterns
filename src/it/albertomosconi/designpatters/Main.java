package it.albertomosconi.designpatters;

import it.albertomosconi.designpatters.observer.PhoneDisplay;
import it.albertomosconi.designpatters.observer.TelevisionDisplay;
import it.albertomosconi.designpatters.observer.WeatherStation;
import it.albertomosconi.designpatters.strategy.CityDuck;
import it.albertomosconi.designpatters.strategy.MountainDuck;
import it.albertomosconi.designpatters.strategy.RubberDuck;

public class Main {
    public static void main(String[] args){
//        STRATEGY PATTERN - uncomment the lines below and run to see it in action
//        var cityDuck = new CityDuck();
//        var mountainDuck  = new MountainDuck();
//        var rubberDuck = new RubberDuck();
//        cityDuck.fly();
//        cityDuck.quack();
//        mountainDuck.fly();
//        mountainDuck.quack();
//        rubberDuck.fly();
//        rubberDuck.quack();

//        OBSERVER PATTERN - uncomment the lines below and run to see it in action
//        var weatherStation = new WeatherStation();
//        var androidPhoneDisplay = new PhoneDisplay(weatherStation);
//        weatherStation.add(androidPhoneDisplay);
//        var iOSPhoneDisplay = new PhoneDisplay(weatherStation);
//        weatherStation.add(iOSPhoneDisplay);
//        var tvDisplay = new TelevisionDisplay(weatherStation);
//        weatherStation.add(tvDisplay);
//
//        androidPhoneDisplay.display();
//        iOSPhoneDisplay.display();
//        tvDisplay.display();
//
//        weatherStation.setTemperature(100);
//
//        androidPhoneDisplay.display();
//        iOSPhoneDisplay.display();
//        tvDisplay.display();
    }
}
