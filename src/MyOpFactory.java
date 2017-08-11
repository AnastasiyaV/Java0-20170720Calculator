public class MyOpFactory  {
    public Operation getOpInstance(String op) {
        switch (op) {
            case "+":
                return new OpPlus();
            case "-":
                return new OpMinus();
            case "/":
                return new OpDiv();
            case "*":
                return new OpMul();
            default:
                return null;
        }
    }
}