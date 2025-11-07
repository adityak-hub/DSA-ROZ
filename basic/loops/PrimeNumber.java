package basic.loops;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");

        int n = sc.nextInt();

        if(n==2){
            System.out.println("Prime Number");
        }else{
            
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(n); i++){   // we can use Math.sqrt(n) insted of n-1 it is good approach.
                if(n%i==0){
                isprime=false;
                }
            }

            if(isprime==true){
                System.out.println("Prime Number");
            }else{
                System.out.println("not a Prime Number");
            }
        }

        
    }

    
}
