package it.albertomosconi.designpatters.adapter;

public class LightningToUsbAdapter implements IUsbCPhone {

    private final ILightningPhone lightningPhone;

    public LightningToUsbAdapter(ILightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

    @Override
    public void useUsbC() {
        System.out.println("USB C connected");
        lightningPhone.useLightning();
    }
}
