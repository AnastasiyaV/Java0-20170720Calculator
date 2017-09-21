public class MyOpFactory  {
    public Operation getOpInstance(MainCalculator.Signs op) {
        switch (op) {
//            case "+":
//                return new OpPlus();
//            case "-":
//                return new OpMinus();
//            case "/":
//                return new OpDiv();
//            case "*":
//                return new OpMul();
//            case "%":
//                return new OpNOK();
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