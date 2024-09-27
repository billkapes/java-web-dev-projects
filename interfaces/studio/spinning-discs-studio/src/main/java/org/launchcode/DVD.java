package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String data) {
        super(data);
    }

    @Override
    public void spin() {
        System.out.println("a DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void laserEtchData() {

    }

    @Override
    public String laserReadData() {
        return "";
    }

    @Override
    public void reportMataData() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
