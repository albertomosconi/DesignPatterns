package it.albertomosconi.designpatters.iterator;

import it.albertomosconi.designpatters.Pattern;

public class IteratorPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("ITERATOR PATTERN");

        Inventory inv;
        inv = new HandHeldInventory(null, null ); //fix with right and left items
        InventoryIterator iter= inv.getIterator();
        /**
         * astract iteration
         */
        while (!iter.isDone())
        {
            iter.current();
            //do something
            iter.next();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Iterator Pattern";
    }
}
