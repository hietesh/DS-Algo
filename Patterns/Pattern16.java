package Patterns;
import java.util.Scanner;

/*
        ABCDE
        ABCD
        ABC
        AB
        A
 */
public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char st = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(st);
            }
            st = (char) (st + 1);
            System.out.println();
        }
        sc.close();     
    }
}