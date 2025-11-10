package pattern;
import java.util.*;

public class Floyds_TRIANGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows: ");
        int n = sc.nextInt();
        
        int counter=1;

        // for rows
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }

    }
}
