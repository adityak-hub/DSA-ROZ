package basic.loops;

import java.util.Scanner;

public class doWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.println("Enter your number:");
            int n = sc.nextInt();

            if(n%10==0){
                break;
            }
            System.out.println("your number is = " +n);
            
            
        }while(true);
        
    }
    
}

