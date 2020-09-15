package it.albertomosconi.designpatters.abstractfactory;

public interface EnemyShipFactory {
    ESWeapon addESGun();
    ESEngine addESEngine();
}
