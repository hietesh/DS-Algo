package BasicRecursion;
/* 

    5 Hitesh
    Hitesh Hitesh Hitesh Hitesh Hitesh 

 */
import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = sc.next();
        printName(n,name);
        sc.close();
    }

    private static void printName(int n,String name) {
        if(n==0){
            return;
        }
        printName(n-1,name);
        System.out.print(name+" ");
    }
}
