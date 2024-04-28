package edu.modules.counter;

import edu.modules.counter.errors.InvalidParametersException;

public class Counter {
  public static void count(int firstValue, int secondValue) throws InvalidParametersException {
    if (firstValue > secondValue) {
      throw new InvalidParametersException();
    }

    int counter = (firstValue - secondValue) * -1;
    for (int i = 0; i <= counter; i++) {
      System.out.printf("Imprimindo o valor %d \n", i);
    }
  }
}
