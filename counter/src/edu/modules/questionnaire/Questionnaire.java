package edu.modules.questionnaire;

import java.util.Scanner;

public class Questionnaire {
  private int[] answers;

  public void execute() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int firstValue = scanner.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int secondsValue = scanner.nextInt();

    scanner.close();

    int[] answer = { firstValue, secondsValue };

    this.answers = answer;
  }

  public int[] getAnswers() {
    return this.answers;
  }
}
