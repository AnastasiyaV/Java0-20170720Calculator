import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter sign");
            String sign = sc.next();
            System.out.println("Enter second number");
            int b = sc.nextInt();
        MyOpFactory myOpFactory = new MyOpFactory();
        System.out.println(myOpFactory.getOpInstance(sign).exec(a,b));
    }
}
