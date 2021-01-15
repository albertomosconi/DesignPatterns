package it.albertomosconi.designpatters.adapter;

import it.albertomosconi.designpatters.Pattern;

public class AdapterPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("ADAPTER PATTERN");

        Android android = new Android();
        IPhone iPhone = new IPhone();

        System.out.println("Recharging android phone with USB C");
        android.useUsbC();
        android.recharge();
        System.out.println();

        System.out.println("Recharging iPhone with Lightning");
        iPhone.useLightning();
        iPhone.recharge();
        System.out.println();

        System.out.println("Recharging iPhone with USB C using an Adapter");
        LightningToUsbAdapter iPhoneAdapter = new LightningToUsbAdapter(iPhone);
        iPhoneAdapter.useUsbC();
        iPhoneAdapter.recharge();

        System.out.println();
    }

    @Override
    public String toString() {
        return "Adapter Pattern";
    }
}
