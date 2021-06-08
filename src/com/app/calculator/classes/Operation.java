package com.app.calculator.classes;

import com.app.calculator.interfaces.MathCalculator;

public abstract class Operation implements MathCalculator {
  protected int number1;
  protected int number2;

  public Operation(int number1, int number2){
    this.number1 = number1;
    this.number2 = number2;
  }

  @Override
  public Boolean validate(){
    return number1 >= 0 && number2 >= 0;
  }

  @Override
  public final int calculate(){
    if(validate()){
      return doOperation();
    } else return -1;
  }

  protected abstract int doOperation();
}
