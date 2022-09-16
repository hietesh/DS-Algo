package BasicRecursion;

/* 
    6
    0 1 1 2 3 5 8 
*/

import java.util.Scanner;
public class PrintFibonacciN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=n;i++){
		   System.out.print(fibonacci(i)+" ");   
		}
		sc.close();
	}
	
	private static int fibonacci(int n){
	    if(n==0 || n==1){
	        return n;
	    }
	    int ans = fibonacci(n-1)+fibonacci(n-2);
	    return ans;
	}
}