package pattern;
import java.util.*;

public class RightAngled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your line number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){   // for line
            for(int j=1; j<=i; j++){   // for star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
