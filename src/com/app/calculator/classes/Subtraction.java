package com.app.calculator.classes;

public class Subtraction extends Operation {
  public Subtraction(int number1, int number2){
    super(number1, number2);
  }

  @Override
  protected int doOperation(){
    return number1 - number2;
  }
}
