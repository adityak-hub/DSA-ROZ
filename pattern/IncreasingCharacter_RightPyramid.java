package pattern;
import java.util.*;

public class IncreasingCharacter_RightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        char ch ='A';
        for(int i=1; i<=n; i++){ // outer loop for line
            for(int j=1; j<=i; j++){ //  inner loop for character
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }

    }
}
