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
//                return new OpGCD();
            case PLUS:
                System.out.println("You chose " + op.getSymbol());
                return new OpPlus();
            case MINUS:
                System.out.println("You chose " + op.getSymbol());
                return new OpMinus();
            case DIVIDE:
                System.out.println("You chose " + op.getSymbol());
                return new OpDiv();
            case MULTIPLY:
                System.out.println("You chose " + op.getSymbol());
                return new OpMul();
            case GCD:
                System.out.println("You chose " + op.getSymbol());
                return new OpGCD();
            default:
                return null;
        }
    }
}