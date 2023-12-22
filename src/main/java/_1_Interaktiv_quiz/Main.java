package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        Quiz quiz = new Quiz();

        ArrayList<String> wrongAnswerWheel = new ArrayList<>();
        wrongAnswerWheel.add("Triangle");
        wrongAnswerWheel.add("Square");
        quiz.addQuizElement(new QuizElement("What shape is a wheel?","Circle",wrongAnswerWheel));

        ArrayList<String> wrongAnswerCrab = new ArrayList<>();
        wrongAnswerCrab.add("4");
        wrongAnswerCrab.add("12");
        quiz.addQuizElement(new QuizElement("How many legs does a crab have?","8",wrongAnswerCrab));

        ArrayList<String> wrongAnswersBrand = new ArrayList<>();
        wrongAnswersBrand.add("Electronics");
        wrongAnswersBrand.add("Cosmetics");
        quiz.addQuizElement(new QuizElement("What does the brand GANNI produce?", "Clothing", wrongAnswersBrand));

        quiz.playGame();

    }
}
