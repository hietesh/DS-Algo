package KnowBasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    
    static int getCount(int num){
        int count = 0;
        while(num!=0){num/=10;count++;}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int X = num;
        int count = getCount(num);
        int ans = 0;
        while(num!=0){
            int rem = num % 10;
            ans = (int) (ans + Math.pow(rem, count));
            num=num/10;
        }
        if(ans == X){
            System.out.println("Yes, it is an Armstrong Number");
        }
        else{
            System.out.println("No, it is not an Armstrong Number");
        }
        sc.close();
    }
}
