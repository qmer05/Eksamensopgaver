package _1_Interaktiv_quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<QuizElement> quizElements;

    public Quiz() {
        quizElements = new ArrayList<>();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < quizElements.size(); i++) {
            askQuestion(quizElements.get(i).getQuestion());
            System.out.print(quizElements.get(i).getChoices());
            String userAnswer = scanner.nextLine().trim();
            if (quizElements.get(i).isCorrect(userAnswer)) {
                System.out.println("Correct answer\n");
            } else {
                System.out.println("Incorrect answer\n");
            }
        }
    }

    public void addQuizElement(QuizElement quizElement) {
        quizElements.add(quizElement);
    }

    public void askQuestion(String question) {
        System.out.println(question);
    }
}
