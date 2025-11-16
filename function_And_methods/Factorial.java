package function_And_methods;
import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        int fact= 1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int n = sc.nextInt();
        System.out.print("The factorial of number is: "+ factorial(n));
    }
    
}
