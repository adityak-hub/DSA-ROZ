package basic.loops;
import java.util.*;

public class break_continue {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=1; i<=5; i++){
        if(i==3){
            continue;  //for skip something
            //break;    // for break from anywhere
        }
        System.out.println(i);
        
        
    }
    System.out.println("I am out of the looop");
    
}
    
}
