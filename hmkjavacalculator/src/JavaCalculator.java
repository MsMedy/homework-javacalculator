import java.util.*;

public class JavaCalculator {

    public int add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        return sum;
    }

    public int subtract(int num1, int num2){
        int minVal = Math.min(num1, num2);
        int maxVal = Math.max(num1, num2);

        int sum2 = maxVal - minVal;
        System.out.println("Value after subtraction: " + sum2);
        return sum2;
    }

    public int multiply(int num1, int num2){

        int sum3 = num2 * num1;
        System.out.println("Value after multiplication: " + sum3);
        return sum3;
    }

    public float divide(float num1, float num2){

        float sum4 = num1 / num2;
        System.out.println("Value after division: " + sum4);
        return sum4;
    }

    public float square(float num1, float num2){

        //num1 ^ num2
        float counter = num2;
        float result = num1;

        if(num2 == 0){
            result = 1;
            System.out.println("Result of values being squared: " + result);
            return 1;
        }

        if(num2 > 0) {
            while (num2 > 1) {
                result *= num1;
                num2--;
            }

            System.out.println("Result of values being squared: " + result);
            return result;
        }
        else{
            return 0;
        }
    }






}
