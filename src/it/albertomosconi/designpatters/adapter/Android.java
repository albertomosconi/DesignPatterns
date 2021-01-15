package it.albertomosconi.designpatters.adapter;

public class Android implements IUsbCPhone {

    private boolean connector;

    @Override
    public void recharge() {
        if (connector) {
            System.out.println("Recharge started");
            System.out.println("Recharge finished");
        } else {
            System.out.println("Connect USB C first");
        }
    }

    @Override
    public void useUsbC() {
        connector = true;
        System.out.println("USB C connected.");
    }
}
