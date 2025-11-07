package basic.loops;
import java.util.*;

public class first_natural_numbers_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
            
        }
        System.out.println(sum);
        
        
        
    }

    
}
