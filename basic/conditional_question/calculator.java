package basic.conditional_question;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println("The sum is = " + a+b);
                       break;
            case '-' : System.out.println("The diff is = " + (a-b));
                       break;
            case '*' : System.out.println("The mul is = " + a*b);
                       break;
            case '/' : System.out.println( "The div is = " + a/b);
                       break;
            case '%' : System.out.println("The rem is = " + a%b);
                        break;
            default : System.out.println("wrong operator");
            break;
        }

    }

    
}
