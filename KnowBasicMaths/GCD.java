package KnowBasicMaths;
/* 
    3 6
    Approach 1: 3
    Approach 2: 3

 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1,num2);
        int ans = 1;
        for(int i=1;i<=min;i++){
            if((num1%i) == 0 && (num2%i) == 0){
                ans = i;
            }
        }
        System.out.println("Approach 1: "+ans);
        System.out.println("Approach 2: "+gcdBetter(num1,num2));
        sc.close();
    }

    //  Euclidean’s theorem  
    //  gcd(a,b) =  gcd(b, a%b)
    static int gcdBetter(int a, int b){
        if(b==0){
            return a;
        }
        return gcdBetter(b,a%b);
    }
}


