package Patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<(n*2)-1;i++){
            int nums = n;
            for(int j=0;j<(n*2)-1;j++){
                System.out.print(nums+" ");
                if(j<i || j<=i){nums--;}
            }
            nums--;
            System.out.println();
        }    
        sc.close();
    }
}
