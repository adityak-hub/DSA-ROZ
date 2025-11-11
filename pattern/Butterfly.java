package pattern;
import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows no: ");
        int n= sc.nextInt();
        
        // first Half
        for(int i=1; i<=n; i++){

            // stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // spaces- 2(n*i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }

        // second Half
        for(int i=n; i>=1; i--){

             // stars- i

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            // spaces- 2(n*i)

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

           // stars- i

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
        
         
            
        
        
        
    }
}
