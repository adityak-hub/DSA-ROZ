package basic.loops;
import java.util.*;

public class reverse_number {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int lastdigit=0;
     for(int i=0; i<n; i++){
        lastdigit = n%10;
        n = n/10;

     }
     System.out.println(lastdigit);
    }
    
}
