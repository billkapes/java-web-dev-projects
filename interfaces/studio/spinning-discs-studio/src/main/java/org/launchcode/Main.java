package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("some cd data");
        DVD dvd1 = new DVD("some dvd data");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.spin();
        dvd1.spin();
        cd1.throwDisc();
        dvd1.throwDisc();
    }
}