package it.albertomosconi.designpatters.singleton;

import it.albertomosconi.designpatters.Pattern;

public class SingletonPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("SINGLETON PATTERN");

        var god = God.getInstance();
        System.out.println(god.getCommandment());
        System.out.println(god.getCommandment());

//        it is impossible to create another God instance
//        var god2 = new God(); <-- this is not allowed: the constructor is private

        System.out.println();
    }
}
