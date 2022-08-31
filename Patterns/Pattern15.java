package Patterns;
import java.util.Scanner;

/*
        ABCDE
        ABCD
        ABC
        AB
        A
 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            char st = 'A';
            for(int j=0;j<i;j++){
                System.out.print(st);
                st = (char) (st + 1);
            }
            System.out.println();
        }
        sc.close();     
    }
}