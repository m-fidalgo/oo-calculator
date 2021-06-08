package com.app.calculator.classes;

public class Addition extends Operation {
  public Addition(int number1, int number2) {
    super(number1, number2);
  }

  @Override
  protected int doOperation() {
    return number1 + number2;
  }
}
