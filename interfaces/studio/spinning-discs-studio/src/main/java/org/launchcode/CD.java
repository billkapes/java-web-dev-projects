package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String data) {
        super(data);
    }

    @Override
    public void spin() {
        System.out.println("a CD spins at a rate of 200 - 500 rpm");
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
