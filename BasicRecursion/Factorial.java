package BasicRecursion;

import java.util.Scanner;

/* 
    
    5
    120    

 */

public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(factorial(n));
       sc.close(); 
    }

    private static int factorial(int n) {
        if(n==0){return 1;}
        int fact = n * factorial(n-1); 
        return fact;
    }
}
