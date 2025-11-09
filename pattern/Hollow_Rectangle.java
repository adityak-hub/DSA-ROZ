package pattern;
import java.util.*;

public class Hollow_Rectangle {
    public static void HollowRectangle(int totrows, int totcols) {
        //outer loop for rows
        for(int i=1; i<=totrows; i++){
            // innner loop for cols
            for(int j=1; j<=totcols; j++){
                // for cell
                if(i==1 || i==totrows || j==1 || j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        HollowRectangle(4,5 );
    }
}
    
















