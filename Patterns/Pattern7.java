package Patterns;
import java.util.Scanner;
class Pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n-1;
        int star = 1;
        for(int i=0;i<n;i++){
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            spaces--;
            star=star+2;
            System.out.println();
        }
        sc.close();
    }
}
