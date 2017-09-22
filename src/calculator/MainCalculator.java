package calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter sign (+ , - , / , * , %)");
        String sign = sc.next();
        Signs operationSimbols = Signs.valueOf(getSign(sign));
        Operation operation = new MyOpFactory().getOpInstance(operationSimbols);
        if (operation == null) {
            System.out.println("wrong sign " + sign);
            return;//out from main method
        }
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(operation.exec(a, b)); //т.к. мы не используем больше нигде calculator.MyOpFactory
        // переменную , то и не надо ее создавать, т.е. мы создаем не объект
        // фабрики, а объект операции
    }
    private static String getSign(String normalSign) throws IllegalArgumentException {
        switch (normalSign) {
            case "+":
                return "PLUS";
            case "-":
                return "MINUS";
            case "/":
                return "DIVIDE";
            case "*":
                return "MULTIPLY";
            case "%":
                return "NOK";
        }
        throw new IllegalArgumentException("You entered unsupported sign");
    }
    enum Signs {
        PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*"), NOK("%");
        private String symbol;
        public String getSymbol() {
            return symbol;
        }
        private Signs(String symbol) {
            this.symbol = symbol;
        }
    }
}
