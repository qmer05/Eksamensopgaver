package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add("blue");
        wrongAnswers.add("purple");
        wrongAnswers.add("grey");

        QuizElement quizElement = new QuizElement("Which color does a traffic light have?","red",wrongAnswers);
        boolean answer = quizElement.isCorrect("red");
        System.out.println(answer);

    }
}
