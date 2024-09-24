package org.example;

public class MultipleChoice extends Question{
    private String answer;

    public MultipleChoice(String question, String answer) {
        super(question);
        this.answer = answer;
    }



    public String getAnswer() {
        return answer;
    }
}
