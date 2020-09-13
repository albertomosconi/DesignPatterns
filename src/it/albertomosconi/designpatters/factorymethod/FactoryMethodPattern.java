package it.albertomosconi.designpatters.factorymethod;

import it.albertomosconi.designpatters.Pattern;

public class FactoryMethodPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("FACTORY METHOD PATTERN");

        var shipFactory = new EnemyShipFactory();

//        pass "U" to create UFO and pass "R" to create rocket
        EnemyShip enemyShip = shipFactory.makeEnemyShip("U");

        if (enemyShip != null) {
            enemyShip.display();
            enemyShip.followHeroShip();
            enemyShip.shoot();
        }

        System.out.println();
    }
}
