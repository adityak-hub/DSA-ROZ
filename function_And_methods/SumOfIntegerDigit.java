package function_And_methods;
import java.util.*;

import java.util.Scanner;

public class SumOfIntegerDigit {
     public static int SumOfIntegerdigit(int n) {
        int sumofdigit = 0;
        while(n>0){
            int lastdigit = n%10;
            sumofdigit += lastdigit;
            n/=10;
        }
        return sumofdigit;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer number: ");
        int n = sc.nextInt();
        System.out.println("Sum Of Integer Digit = " +SumOfIntegerdigit(n));
        
    }
}
