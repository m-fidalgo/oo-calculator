package com.app.calculator.app;

import com.app.caculator.factories.OperationFactory;
import com.app.calculator.classes.Operation;

public class Program {
  public static void main(String[] args) throws Exception {
    String op = "/";
    int number1 = 10, number2 = 2;
    OperationFactory factory = new OperationFactory();
    Operation calculatorOp = (Operation) factory.createCalculator(number1, number2, op);

    if(calculatorOp != null)
      System.out.println(calculatorOp.calculate());
    else System.out.println("Cálculo inválido");
  }
}
