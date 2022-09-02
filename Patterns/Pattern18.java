package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char startChar = (char) (64 + n);
        for(int i=1;i<=n;i++){
            char nxtChar = startChar;
            for(int j=1;j<=i;j++){
                System.out.print(nxtChar+" ");
                nxtChar++;
            }
            System.out.println();
            startChar--;
        }
        sc.close();
    }
}
