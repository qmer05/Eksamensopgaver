package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class QuizElement {
    private String question;
    private String correctAnswer;
    private ArrayList<String> wrongAnswers;

    public QuizElement(String question, String correctAnswer, ArrayList<String> wrongAnswers){
        this.question = question;
        this.correctAnswer = correctAnswer;
        wrongAnswers = new ArrayList<>();
    }

    public boolean isCorrect(String answer){
        return answer.equals(correctAnswer);
    }

    public String getQuestion(){
        return question;
    }

}
