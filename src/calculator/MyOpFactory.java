package calculator;

import calculator.AllOperations.*;

public class MyOpFactory  {
    public Operation getOpInstance(MainCalculator.Signs op) {
        switch (op) {
//            case "+":
//                return new calculator.AllOperations.OpPlus();
//            case "-":
//                return new calculator.AllOperations.OpMinus();
//            case "/":
//                return new calculator.AllOperations.OpDiv();
//            case "*":
//                return new calculator.AllOperations.OpMul();
//            case "%":
//                return new calculator.AllOperations.OpNOK();
            case PLUS:
                System.out.println("You've chosen " + op.getSymbol());
                return new OpPlus();
            case MINUS:
                System.out.println("You've chosen " + op.getSymbol());
                return new OpMinus();
            case DIVIDE:
                System.out.println("You've chosen " + op.getSymbol());
                return new OpDiv();
            case MULTIPLY:
                System.out.println("You've chosen " + op.getSymbol());
                return new OpMul();
            case NOK:
                System.out.println("You've chosen " + op.getSymbol());
                return new OpNOK();
            default:
                return null;
        }
    }
}