package calculator.AllReaderMethods;

import calculator.DataReader;

import java.util.Scanner;


public class ReadConsole implements DataReader {
    private final Scanner sc;

    public ReadConsole() {
        sc = new Scanner(System.in);
    }

    @Override
    public int getFirstNumber() throws Exception {
        System.out.println("Enter first number");
        int a;
        try {
            a = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Wrong figure. Number is needed");
        }
        return a;
    }

    @Override
    public String getOperation() {
        System.out.println("Enter sign (+ , - , / , * , %)");
        return sc.next();
    }

    @Override
    public int getSecondNumber() {
        System.out.println("Enter second number");
        return sc.nextInt();
    }

    @Override
    public boolean isLast() {
        System.out.println("Do you want to quit? Enter q");
        return sc.next().equals("q");
    }
}
