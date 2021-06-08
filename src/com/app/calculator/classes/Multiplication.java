package com.app.calculator.classes;

public class Multiplication extends Operation {
  public Multiplication(int number1, int number2){
    super(number1, number2);
  }

  @Override
  protected int doOperation(){
    return number1 * number2;
  }
}
