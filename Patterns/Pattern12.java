package Patterns;
/*

    1        1
    12      21
    123    321
    1234  4321
    1234554321

*/
import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }  
            }
            for(int k=n;k>=1;k--){
               if(k>i){
                 System.out.print(" ");
               }
               else{
                System.out.print(k);
               } 
            }
            sp=sp-2;
            System.out.println();       
        }
        sc.close();
    }
}
