package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args_) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int lengthInput = input.nextInt();
        System.out.println("Enter width of rectangle:");
        int widthInput = input.nextInt();
        int area = lengthInput * widthInput;
        System.out.println("Area = " + area);
    }
}
