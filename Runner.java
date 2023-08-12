import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		int arr[][]=new int[4][5];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        arr[i][j]=i*j;
    }
    System.out.print(arr[3][4]);

	}
}

class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		String rev="";
		for(int j=input.length()-1;j>=0;j--){
			rev+= input.charAt(j);
		}


		int prevSp = 0;

		for(int i=0;i<rev.length();i++){
			if(rev.charAt(i)==' '){
				String temp = "";
				for(int j=i-1;j>=prevSp;j--){
					temp+=rev.charAt(j);
				}
				rev = temp + rev.substring(i,rev.length());
				prevSp = i+1; 
			}
		}

		return rev;
	}
}