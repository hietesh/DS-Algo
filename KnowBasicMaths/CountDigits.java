package KnowBasicMaths;

import java.util.Scanner;

/* 
    Input: N = 12345
    Output: 5
*/
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        while(n!=0){
            n=n/10;
            count++;   
        }
        System.out.println(count);
        sc.close();        
    }
}
