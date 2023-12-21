package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        /*
        ArrayList<String> wrongAnswers = new ArrayList<>();
        wrongAnswers.add("blue");
        wrongAnswers.add("purple");
        wrongAnswers.add("grey");

        QuizElement quizElement = new QuizElement("Which color does a traffic light have?","red",wrongAnswers);
        boolean answer = quizElement.isCorrect("red");
        System.out.println(answer);

         */

        Quiz quiz = new Quiz();

        ArrayList<String> wrongAnswerWheel = new ArrayList<>();
        wrongAnswerWheel.add("Triangle");
        wrongAnswerWheel.add("Square");
        quiz.addQuizElement(new QuizElement("What shape is a wheel?", "Circle",wrongAnswerWheel));

        ArrayList<String> wrongAnswerCrab = new ArrayList<>();
        wrongAnswerCrab.add("4");
        wrongAnswerCrab.add("12");
        quiz.addQuizElement(new QuizElement("How many legs does a crab have?","12",wrongAnswerCrab));

        quiz.playGame();

    }
}
