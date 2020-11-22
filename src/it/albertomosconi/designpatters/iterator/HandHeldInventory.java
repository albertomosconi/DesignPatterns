package it.albertomosconi.designpatters.iterator;

public class HandHeldInventory implements Inventory{
    /**
     * publicly gettable
     * privately settable
      */
    public Item right;
        public Item left;

        public HandHeldInventory(Item right, Item left){
            this.right=right;
            this.left=left;
        }

    /**
     * factory method
     * @return
     */
        public InventoryIterator getIterator(){
            return new HandHeldInventoryIterator(this);
        }
    }
