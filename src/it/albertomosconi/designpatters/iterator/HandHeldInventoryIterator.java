package it.albertomosconi.designpatters.iterator;

public class HandHeldInventoryIterator implements InventoryIterator {

    private HandHeldInventory inventory;
    /**
     * keep track where we are
     */
    private int index=0;

    public HandHeldInventoryIterator(HandHeldInventory i)
    {
        this.inventory=i;
    }

    /**
     * 0 the item has a right one
     * 1 the item has a left one
     * 2 iteration is over: you have a previous and not a next;
     */
    @Override
    public boolean isDone() {
        return this.index<2;
    }

    /**
     * takes note of which ones has showed
     */
    @Override
    public void next() {
        this.index+=1;
    }

    @Override
    public Item current() {
        switch (index){
            case 0:
                return this.inventory.right;
            case 1:
                return this.inventory.left;
            default:
                return null;
        }
    }
}
