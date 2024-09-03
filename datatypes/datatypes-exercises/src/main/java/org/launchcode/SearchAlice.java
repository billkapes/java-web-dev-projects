package org.launchcode;
import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                " having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, ‘and what is the use of" +
                " a book,’ thought Alice ‘without pictures or conversation?’";
        firstSentence = firstSentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search.");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();
        if (firstSentence.contains(searchTerm)) {
            System.out.println("Your term was found!");
            Integer index = firstSentence.indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("You search term appears at index " + index +
                    ". Your tern is " + length + " characters long.");
            String modifiedSentence = firstSentence.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Your term was NOT found.");
        }

    }
}
