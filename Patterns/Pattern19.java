package Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // first half of inside diamond
        int spaces = 0;
        for(int i=1;i<=n;i++){
            int tempSpaces = spaces;
            for(int j=1;j<=n*2;j++){   
                
                else{
                    System.out.print("*");
                }  
            }
            spaces += 2;
            System.out.println(); 
        }
        // second half of inside diamond
        for(int i=1;i<=n;i++){

        }
        sc.close();
    }
}
