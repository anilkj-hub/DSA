import java.util.Scanner;

public class function {
    //public static int calculate(int a ,int b){
    //    int mul = a*b;
    //    return mul;
     public static void factorial(int n){
        //loop
        int factorial =1;
        for (int i=n; i>=1; i--){
            factorial =factorial*i;
        }
        System.out.println(factorial);
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
         factorial(n);
    }
}
