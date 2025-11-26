package array.basic_array_quest;

public class LinearSearch {
    public static int SumOfIntegerdigit(int n) {
        int sumofdigit = 0;
        while(n>0){
            int lastdigit = n%10;
            sumofdigit += lastdigit;
            n/=10;
        }
        return sumofdigit;
        
    }
    public static void main(String[] args) {
        Scanner sc = new(System.in);
        System.out.println("Enter your integer number: ");
        int n = sc.nextInt();
        System.out.println((sum(2743)));
        
    }
    
}
