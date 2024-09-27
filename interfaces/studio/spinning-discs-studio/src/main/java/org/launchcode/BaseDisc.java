package org.launchcode;

public class BaseDisc implements Frisbee{
    public String data;

    public BaseDisc(String data) {
        this.data = data;
    }

    @Override
    public void throwDisc() {
        System.out.println("throw disc");
    }
}
