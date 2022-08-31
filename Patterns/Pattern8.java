package Patterns;
import java.util.Scanner;
class Pattern8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n-1;
        for(int i=0;i<n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<star+(star+1);j++){
                System.out.print("*");
            }
            star--;
            System.out.println();
        }
        sc.close();
    }
}