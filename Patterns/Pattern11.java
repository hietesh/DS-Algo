package Patterns;

import java.util.Scanner;

/* 
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

*/
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        for(int i=0;i<n;i++){
            if(i%2==0){st=1;}else{st=0;}    
            for(int j=0;j<=i;j++){
                System.out.print(st+" ");
                if(st==0){st=1;}else{st=0;}
            }
            System.out.println();
        } 
        sc.close(); 
    }
}
