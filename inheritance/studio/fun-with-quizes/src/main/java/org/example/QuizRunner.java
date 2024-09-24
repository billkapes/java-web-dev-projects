package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice q1 = new MultipleChoice("What plane do we live on? \n 1. Mars\n 2. Earth", "1, 2");

        Quiz quiz = new Quiz();
        quiz.addQuestion(q1);
        quiz.printQuestion();
    }
}
