package BasicRecursion;
/* 

    6
    21

*/
import java.util.Scanner;

public class SumNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
        sc.close();
    }

    private static int printSum(int n) {
        if(n==0){return 0;}
        int sum = n + printSum(n-1);
        return sum;
    }
}
