package BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        // array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr);
        
        // reversed array display
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void reverse(int[] arr) {
        helper(arr,0,arr.length-1);
    }

    private static void helper(int[] arr, int st, int end) {
        if(st>=end){
            return;
        }
        int temp = arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        helper(arr,st+1,end-1);
    }
}
