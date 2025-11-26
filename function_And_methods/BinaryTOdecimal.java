package function_And_methods;
import java.util.*;

public class BinaryTOdecimal {
    public static void binnum(int binnum) {
        int mynum = binnum;;
        int pow=0;
        int decnum = 0;
        while(binnum>0){
            int last_digit = binnum%10;
            decnum = decnum + (last_digit * (int)(Math.pow(2,pow)));
            
            pow++;
            binnum = binnum/10;
        }    
        System.out.println("Decimal of " + mynum +"=" +  decnum);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Binary number: ");
        int n = sc.nextInt();
        binnum(n);   
    }
}
