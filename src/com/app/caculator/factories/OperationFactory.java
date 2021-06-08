package com.app.caculator.factories;

import com.app.calculator.classes.Addition;
import com.app.calculator.classes.Division;
import com.app.calculator.classes.Multiplication;
import com.app.calculator.classes.Subtraction;
import com.app.calculator.interfaces.MathCalculator;

public class OperationFactory {
  public MathCalculator createCalculator(int number1, int number2, String operation){
    if(operation.equals("+"))
      return new Addition(number1, number2);
    else if(operation.equals("-"))
      return new Subtraction(number1, number2);
    else if(operation.equals("*"))
      return new Multiplication(number1, number2);
    else if(operation.equals("/"))
      return new Division(number1, number2);
    else return null;    
  }
}
