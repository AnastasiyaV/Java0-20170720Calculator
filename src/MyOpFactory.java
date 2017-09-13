public class MyOpFactory  {
    public Operation getOpInstance(MainCalculator.Signs op) {
        switch (op) {
            case "+":
                return new OpPlus();
            case "-":
                return new OpMinus();
            case "/":
                return new OpDiv();
            case "*":
                return new OpMul();
            case "%":
                return new OpGCD();
            default:

                return null;
        }
    }
}