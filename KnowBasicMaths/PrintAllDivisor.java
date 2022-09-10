package KnowBasicMaths;
/* 
    36
    1 2 3 4 6 9 12 18 36 
    
 */
import java.util.Scanner;

public class PrintAllDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
