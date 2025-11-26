package function_And_methods;
import java.util.*;


public class Palindrome {
    public static int palin(int n) {
        int last_digit = 0;
        int reversed = 0;
        while(n>0){
            last_digit = n%10;
            reversed = reversed*10+last_digit;
            n/=10;
        }
        return reversed;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.println("Palindrome is = " + palin(n) );
    }
}
