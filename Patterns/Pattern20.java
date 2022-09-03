package Patterns;
/*
    5
    
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *    

 */
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //first half of the pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2;j++){
                if(j<=i || j>=(n*2)-(i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }    
            }
            System.out.println();
        }
        // second half of the pattern
        for(int i=1;i<n;i++){
            for(int j=1;j<=n*2;j++){
                if(j<=(n-i) || j>(n + i)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
        sc.close();
    }
}
