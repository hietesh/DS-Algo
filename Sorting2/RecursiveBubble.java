package Sorting2;

import java.util.Scanner;

public class RecursiveBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        recursiveBubbleSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void recursiveBubbleSort(int[] arr, int st, int end) {
        if(end == st){
            return;
        }

        recursiveBubbleSort(arr, st, end--);

        for(int i=st;i<end;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        
    }
}
