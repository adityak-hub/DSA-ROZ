package pattern;
import java.util.*;

public class Daimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            // for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=(2*i)-1; j++){   // 2*i-1 or 2*i+1 they are used for print odd no of start.(2*i-1) it follow the condition
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
