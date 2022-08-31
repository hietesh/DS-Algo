package Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        for(int i=0;i<n;i++){
            for(int k=0;k<sp;k++){
                System.out.print(" ");
            }
            char st = '@';
            for(int j=0;j<(i+i)+1;j++){
                if(j<=i){
                    st = (char) (st + 1);    
                }
                else{
                    st = (char) (st - 1);
                }
                System.out.print(st);    
                
            }
            sp--;
            System.out.println();
        }
        sc.close();
    }
}
