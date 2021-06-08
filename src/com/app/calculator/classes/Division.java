package com.app.calculator.classes;

public class Division extends Operation {
  public Division(int number1, int number2){
    super(number1, number2);
  }

  @Override
  public Boolean validate(){
    return number1 >= 0 && number2 > 0;
  }

  @Override
  protected int doOperation(){
    return number1 / number2;
  }
}
