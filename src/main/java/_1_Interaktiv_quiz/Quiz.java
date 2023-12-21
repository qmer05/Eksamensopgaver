package _1_Interaktiv_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private QuizElement quizElement;
    private ArrayList<QuizElement> quizElements;

    public Quiz() {
        quizElements = new ArrayList<>();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quizElements.size(); i++) {
            askQuestion(quizElements.get(i).getQuestion());
            String userAnswer = scanner.nextLine().trim();
            boolean answerResult = quizElements.get(i).isCorrect(userAnswer);
            System.out.println(answerResult);

        }
    }

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void askQuestion(String question) {
        System.out.println(question + "\nChose the correct answer: ");
    }
}
