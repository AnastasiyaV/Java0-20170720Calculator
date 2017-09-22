package calculator.AllOperations;

import calculator.Operation;

public class OpNOK implements Operation {

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }
    @Override
    public int exec(int a, int b) {
        return a / gcd(a, b) * b;
    }

//    List<Integer> simpleDividersFirstNumber = new ArrayList();
//    List<Integer> simpleDividersSecondNumber = new ArrayList();
//    List<Integer> unicSimpleDividers = new ArrayList();
//        double sqrt = Math.sqrt(a);
//        int currentValue = a;
//        int multiplier = 2;
//        while (currentValue > 1 && multiplier <= sqrt)
//        {
//            if (currentValue % multiplier == 0)
//            {
//                System.out.print("multiplier = "+multiplier + " ");
//                simpleDividersFirstNumber.add(multiplier);
//                currentValue /= multiplier;
//            }
//            else {
//                if (multiplier == 2) {
//                    multiplier++;
//                } else {
//                    multiplier += 2;
//                }
//            }
//        }
//        if (currentValue != 1)
//        {
//            System.out.print(currentValue);
//        }
//        return currentValue;

//        for(int i=0;i<simpleDividersFirstNumber.size();i++){
//            System.out.println(simpleDividersFirstNumber.get(i));
//        System.out.println(simpleDividersFirstNumber);
//        for (int currentSimpleDividersFirstNumber: simpleDividersFirstNumber)
//            System.out.println(currentSimpleDividersFirstNumber);


    //Greatest common divider:
//        if (b == 0) {
//            return Math.abs(a);
//        }
//        return exec(b, a % b);
}