package Patterns;

import java.util.Scanner;

/*
    A
    AB
    ABC
    ABCD
    ABCDE

 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            char st = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(st);
                st = (char) (st + 1);
            }
            System.out.println();
        }
        sc.close();     
    }
}
