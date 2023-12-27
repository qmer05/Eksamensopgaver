package _1_Interaktiv_quiz;

import java.util.ArrayList;
import java.util.Collections;

public class QuizElement {
    private String question;
    private String correctAnswer;
    private ArrayList<String> wrongAnswers;
    private ArrayList<String> choices = new ArrayList<>();

    public QuizElement(String question, String correctAnswer, ArrayList<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;
    }

    public boolean isCorrect(String answer) {
        int numberAnswer = Integer.parseInt(answer);
        numberAnswer -= 1; // trækker 1 fra brugerens input fordi listen er + 1 nede i get choices, for at starte listen fra 1 i stedet for 0.
        return (numberAnswer == choices.indexOf(correctAnswer));
    }

    public String getQuestion() {
        return question;
    }

    public String getChoices() {
        choices.addAll(wrongAnswers);
        choices.add(correctAnswer);
        Collections.shuffle(choices);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < choices.size(); i++) {
            sb.append(i + 1 + ") " + choices.get(i) + "\n");
        }
        return sb.toString();
    }

    public void addWrongAnswer(String wrongAnswer){
        wrongAnswers.add(wrongAnswer);
    }
}
