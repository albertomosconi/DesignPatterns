package it.albertomosconi.designpatters.iterator;

public interface InventoryIterator {
    boolean isDone();
    void next();
    Item current();
}
