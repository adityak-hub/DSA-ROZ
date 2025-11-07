package basic.loops;
import java.util.*;

public class reverse_number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        int lastdigit=0;
        int rev=0;
        for(; n!=0; n/=10){   // no need for initilization   1. [bcz  // int n = sc.nextInt();  <-- already initialized].
                                                     //      2.  The variable n is declared and initialized before the loop starts.
                                                     //      3.  There’s nothing new to initialize inside the for loop.
            lastdigit=n%10;
            rev = (rev*10)+lastdigit;
        }
        System.out.println(rev);
        
    }
    
}
