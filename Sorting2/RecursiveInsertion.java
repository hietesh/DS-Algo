package Sorting2;

import java.util.Scanner;

public class RecursiveInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        recursiveInsertion(arr,1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void recursiveInsertion(int[] arr, int st) {
        if(st==arr.length){
            return;
        }
        int pos = st;
        while(pos > 0 && arr[pos]<arr[pos-1]){
             int temp = arr[pos];
             arr[pos]=arr[pos-1];
             arr[pos-1]=temp;
             pos--;
        }
        recursiveInsertion(arr, st+1);
    }
}
