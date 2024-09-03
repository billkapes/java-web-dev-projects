package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        Double milesDriven = input.nextDouble();
        System.out.println("Enter gallons of gas consumed:");
        Double gasGallons = input.nextDouble();
        Double mpg = milesDriven / gasGallons;
        System.out.println("You are running on " + mpg + " mpg.");
    }
}
