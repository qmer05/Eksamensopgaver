package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Quiz {
    private QuizElement quizElement;
    private ArrayList<QuizElement> quizElements;

    public void playGame(){
        askQuestion(quizElement.getQuestion());
    }

    public Quiz(){
        quizElements = new ArrayList<>();
    }

    public void addQuizElement (QuizElement quizElement){
        quizElements.add(quizElement);
    }

    public void askQuestion(String question){
        System.out.println(question + "Chose the correct answer: ");
    }


}
