package pattern;
import java.util.*;

public class zero_one_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                // for check every cell(i+j)%2
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
}
