package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void printQuestion() {
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String answer = input.nextLine();
            if (question instanceof MultipleChoice) {
                MultipleChoice q = ((MultipleChoice) question);
                if (answer.equals(q.getAnswer())) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Wrong");
                }
            }


        }

    }
}
