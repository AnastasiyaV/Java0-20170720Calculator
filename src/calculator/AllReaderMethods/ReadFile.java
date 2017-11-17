package calculator.AllReaderMethods;

import calculator.DataReader;

import java.io.*;
import java.util.Scanner;

public class ReadFile implements DataReader {
    private final Scanner sc;
    private final BufferedReader reader;
    private String[] splitLine;


    public ReadFile() throws Exception {
        sc = new Scanner(System.in);
        reader = new BufferedReader(new FileReader(new File("sourceOperations.txt")));
        String line = reader.readLine();
        splitLine = line.split(" ");
    }

    @Override
    public int getFirstNumber() throws NumberFormatException {
        System.out.println("Entered first number " + splitLine[0]);
        try {
            int a = Integer.valueOf(splitLine[0]);
            return a;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new NumberFormatException("Wrong figure. Number is needed");
        }

    }

    @Override
    public String getOperation() {
        System.out.println("Entered sign " + splitLine[1]);
        return splitLine[1];
    }

    @Override
    public int getSecondNumber() throws NumberFormatException {
        System.out.println("Entered second number " + splitLine[2]);
        return Integer.valueOf(splitLine[2]);
    }

    @Override
    public boolean isLast() throws IOException {
        String line = reader.readLine();
        if (line == null) {
            return true;
        } else {
            splitLine = line.split(" ");
            System.out.println("Do you want to quit? Enter q / Enter anything else - to continue");
            return sc.next().equals("q");
        }
    }


}

