package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> myInts = new ArrayList<>();

        for (int i = 10; i < 20; i++) {
            myInts.add(i);
        }
        System.out.println(sumEven(myInts));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        String str = "BONUS: Instead of creating our own list of words, what if we want to use the string from the Array Practice section? Search “Java convert String to ArrayList” online to see how to split a string into the more flexible ArrayList collection.";
        String[] strArray = str.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
        printWordsWithLength(arrayList, 5);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWordsWithLength(ArrayList<String> arr, int length) {
        for (String str : arr) {
            if (str.length() == length) {
                System.out.println(str);
            }
        }
    }
}


