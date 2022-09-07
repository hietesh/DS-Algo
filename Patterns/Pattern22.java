package Patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // first half of the pattern
        for(int i=0;i<n;i++){
            int nums = n;
            for(int j=1;j<=n;j++){
                System.out.print(nums+" ");
                if(j<=i){nums--;}
            }
            for(int j=1;j<n;j++){
                if(j>=n-i){nums++;}
                System.out.print(nums+" ");
            }
            System.out.println();
        }
        // second half of the pattern
        for(int i=n-1;i>=0;i--){
            int nums = n;
            for(int j=1;j<=n;j++){
                System.out.print(nums+" ");
                if(j<=i){nums--;}
            }
            for(int j=1;j<n;j++){
                if(j>=n-i){nums++;}
                System.out.print(nums+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}