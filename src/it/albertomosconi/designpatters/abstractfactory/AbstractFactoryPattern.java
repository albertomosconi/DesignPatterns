package it.albertomosconi.designpatters.abstractfactory;

import it.albertomosconi.designpatters.Pattern;

public class AbstractFactoryPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("ABSTRACT FACTORY PATTERN");

        var UFOfactory = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = UFOfactory.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = UFOfactory.orderTheShip("UFO BOSS");
        System.out.println(theBoss);

        System.out.println();
    }

    @Override
    public String toString() {
        return "Abstract Factory Pattern";
    }
}
