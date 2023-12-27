package _1_Interaktiv_quiz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        ArrayList<String> wrongAnswerWheel = new ArrayList<>();
        wrongAnswerWheel.add("Triangle");
        wrongAnswerWheel.add("Square");
        quiz.addQuizElement(new QuizElement("What shape is a wheel?", "Circle", wrongAnswerWheel));

        ArrayList<String> wrongAnswerCrab = new ArrayList<>();
        wrongAnswerCrab.add("4");
        wrongAnswerCrab.add("12");
        quiz.addQuizElement(new QuizElement("How many legs does a crab have?", "8", wrongAnswerCrab));

        ArrayList<String> wrongAnswersBrand = new ArrayList<>();
        wrongAnswersBrand.add("Electronics");
        wrongAnswersBrand.add("Cosmetics");
        quiz.addQuizElement(new QuizElement("What does the brand GANNI produce?", "Clothing", wrongAnswersBrand));

        ArrayList<String> wrongAnswersProgramming = new ArrayList<>();
        wrongAnswersProgramming.add("Java");
        wrongAnswersProgramming.add("Python");
        quiz.addQuizElement(new QuizElement("Which programming language is primarily used for front-end web development?", "JavaScript", wrongAnswersProgramming));

        ArrayList<String> wrongAnswersCar = new ArrayList<>();
        wrongAnswersCar.add("Ford");
        wrongAnswersCar.add("Mercedes-Benz");
        quiz.addQuizElement(new QuizElement("Which car manufacturer produced the first commercially available V8 engine??", "Cadillac", wrongAnswersCar));

        quiz.playGame();

        System.out.println("Total correct answers: " + quiz.getCorrectCounter() + "/" + quiz.getQuizElements().size());
    }
}
