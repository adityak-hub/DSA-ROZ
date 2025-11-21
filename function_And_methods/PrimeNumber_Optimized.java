package function_And_methods;
import java.util.*;

public class PrimeNumber_Optimized {
    static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print(isprime(n));
    }   
}
