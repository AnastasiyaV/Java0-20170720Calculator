package calculator.AllOperations;

import calculator.Operation;

public class OpMinus implements Operation {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}