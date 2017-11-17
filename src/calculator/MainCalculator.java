package calculator;

import calculator.AllReaderMethods.ReadConsole;
import calculator.AllReaderMethods.ReadFile;

import java.util.Scanner;

public class MainCalculator {

    private static boolean isReadFile;

    public static void main(String[] args) {
        DataReader dataReader;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to read from console (c) or file(f)?");
        if (sc.next().equals("c"))
            isReadFile = false;
        else isReadFile = true;
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter sign (+ , - , / , * , %)");
//        String sign = sc.next();
        if (!isReadFile) {
            dataReader = new ReadConsole();
        } else {
            try {
                dataReader = new ReadFile();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            do {
                int a = dataReader.getFirstNumber();
                String sign = dataReader.getOperation();
                int b = dataReader.getSecondNumber();
                Signs operationSimbols = Signs.valueOf(getSign(sign));
                Operation operation = new MyOpFactory().getOpInstance(operationSimbols);
                if (operation == null) {
                    System.out.println("wrong sign " + sign);
                    return;//out from main method
                }
                System.out.println(operation.exec(a, b));
            }
            while (!dataReader.isLast());

        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println("Enter second number");
//        int b = sc.nextInt();
        //т.к. мы не используем больше нигде calculator.MyOpFactory
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
