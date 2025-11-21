package function_And_methods;
import java.util.*;

public class PrimeNumberRange {
    public static boolean isprime(int n) {    // ---> check a number is prime or not
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if( n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void isprimeRange(int n ) {      // print all prime numbers 2 to n
        for(int i=2; i<=n; i++){
            if(isprime(i)){   // true 
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {  // takes input and calls the function
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        isprimeRange(n);
    }
}
