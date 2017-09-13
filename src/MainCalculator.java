import java.util.Scanner;

public class MainCalculator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter sign (+ , - , / , * , % (for Ggreatest Common Divisor) )");
        String sign = sc.next();
        Signs operationSimbols = Signs.valueOf(sign);

        Operation operation = new MyOpFactory().getOpInstance(sign);
        if (operation == null) {
            System.out.println("wrong sign " + sign);
            return;//out from main method
        }
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(operation.exec(a, b)); //т.к. мы не используем больше нигде MyOpFactory
        // переменную , то и не надо ее создавать, т.е. мы создаем не объект
        // фабрики, а объект операции





    }

    enum Signs {
        PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*"), GCD("%")
        //add constructor
        private Signs symbol;
        private Signs

    }
}
