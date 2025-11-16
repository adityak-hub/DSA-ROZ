package function_And_methods;
import java.util.*;

public class Binomial_Coefficient {
    public static int factorial(int n) {
        int fact=1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;

    }
    public static int bincoeff(int n,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.print(bincoeff(n, r));

    }   
}
