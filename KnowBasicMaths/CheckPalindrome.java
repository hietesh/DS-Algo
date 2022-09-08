package KnowBasicMaths;
/*  
    Input: N = 123
    Output: Not Palindrome Number

    Input: N =  121 
    Output: Palindrome Number

*/
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nb = n;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            ans = (ans*10) + rem;
            n = n/10;
        }
        if(nb==ans){System.out.println("Palindrome Number");}
        else{System.out.println("Not Palindrome Number"); }
        sc.close();
    }
}
