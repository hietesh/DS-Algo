package Patterns;
import java.util.Scanner;
class Pattern9{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        // first half of diamond
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i+i)+1;k++){
               System.out.print("*");     
            }
            sp--;
            System.out.println();
        }    
        // second half of diamond
        sp=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(i+i)+1;k++){
                System.out.print("*");     
            }
            System.out.println();
            sp++;     
        }
        sc.close();
    }
}