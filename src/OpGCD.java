import java.util.ArrayList;
import java.util.List;

public class OpGCD implements Operation{

    List<Integer> simpleDividersFirstNumber = new ArrayList<Integer>();
    List<Integer> simpleDividersSecondNumber = new ArrayList<Integer>();
    List<Integer> unicSimpleDividers = new ArrayList<Integer>();

    @Override
    public int exec(int a, int b) {
//        simpleDividersFirstNumber.add(a);
//        for(int i=0;i<simpleDividersFirstNumber.size();i++){
//            System.out.println(simpleDividersFirstNumber.get(i));

//        if (b == 0) {
//            return Math.abs(a);
//        }
//        return exec(b, a % b);


//        A recursive method would be:
//        static int gcd(int a, int b)
//        {
//            if(a == 0 || b == 0) return a+b; // base case
//            return gcd(b,a%b);
//        }
//        Using a while loop:
//        static int gcd(int a, int b)
//        {
//            while(a!=0 && b!=0) // until either one of them is 0
//            {
//                int c = b;
//                b = a%b;
//                a = c;
//            }
//            return a+b; // either one is 0, so return the non-zero value
//        }

        double sqrt = Math.sqrt(a);
        int currentValue = a;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
        return currentValue;
    }



}
