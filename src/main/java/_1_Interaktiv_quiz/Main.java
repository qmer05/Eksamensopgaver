package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        Quiz quiz = new Quiz();

        ArrayList<String> wrongAnswerWheel = new ArrayList<>();
        wrongAnswerWheel.add("Triangle");
        wrongAnswerWheel.add("Square");
        wrongAnswerWheel.add("Circle");

        quiz.addQuizElement(new QuizElement("What shape is a wheel?", "Circle",wrongAnswerWheel));
        ArrayList<String> wrongAnswerCrab = new ArrayList<>();
        wrongAnswerCrab.add("4");
        wrongAnswerCrab.add("8");
        wrongAnswerCrab.add("12");
        quiz.addQuizElement(new QuizElement("How many legs does a crab have?","12",wrongAnswerCrab));

        quiz.playGame();

    }
}
