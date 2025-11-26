package function_And_methods;
import java.util.*;


public class DecimalToBinary {
    public static void DecToBin(int n) {
        int mynum = n;
        int pow = 0;
        int binnum = 0;
        while(n>0){
            int rem = n%2;
            binnum = binnum +(rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;  // deal with Quotient
        }
        System.out.println("Binary of "+ mynum + " = " +binnum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number: ");
        int n = sc.nextInt();
        DecToBin(n);
        
    }
    
}
