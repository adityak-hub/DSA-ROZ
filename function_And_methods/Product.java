package function_And_methods;
import java.util.*;

public class Product {
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int pro=multiply(a, b);
        System.out.print("The product is: " + pro);
    }   
}
