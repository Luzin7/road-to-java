package edu.main.java;

import edu.modules.counter.Counter;
import edu.modules.counter.errors.InvalidParametersException;
import edu.modules.questionnaire.Questionnaire;

public class App {
    public static void main(String[] args) {
        Questionnaire questionnaire = new Questionnaire();

        Thread questionnaireThread = new Thread(() -> {
            questionnaire.execute();
        });

        questionnaireThread.start();

        try {
            questionnaireThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] answers = questionnaire.getAnswers();
        int firstValue = answers[0];
        int secondsValue = answers[1];

        try {
            Counter.count(firstValue, secondsValue);
        } catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            ;
        }
    }
}
