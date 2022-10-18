package BasicRecursion;

/* 

    ABCDCBA
    true

 */

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(checkPalindrome(n));
        sc.close();
    }

    private static boolean checkPalindrome(String n) {
        return helper(n,0,n.length()-1);
    }

    private static boolean helper(String n, int st, int end) {
        if(st>=end){
            return true;
        }
        boolean res;
        if(n.charAt(st)==n.charAt(end)){
            res = helper(n,st+1,end-1);
        }
        else{
            return false;
        }
        return res;
    }
}
