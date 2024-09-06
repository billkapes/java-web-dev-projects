package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a radius.");
    Double radiusInput = input.nextDouble();
    while (radiusInput < 0) {
        System.out.println("Enter a positive number.");
        radiusInput = input.nextDouble();
    }
    double area = Circle.getArea(radiusInput);

    System.out.println("The area of a circle of radius " + radiusInput +
            " is: " + area);
    }
}
