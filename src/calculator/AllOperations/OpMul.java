package calculator.AllOperations;

import calculator.Operation;

public class OpMul implements Operation {
    @Override
    public int exec(int a, int b) {
        return a * b;
    }
}
