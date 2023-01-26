package Sorting2;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void quickSort(int[] arr,int start,int end) {
        if(start >= end){
            return;
        }
        int index = pivotFix(arr,start,end);
        quickSort(arr, start, index-1);
        quickSort(arr, index+1, end);
    }

    private static int pivotFix(int[] arr, int start, int end) {
        // count the number of elements less pivot & considering the first element as a pivot
        int count = 0;
        for(int i=start;i<=end;i++){
            if(arr[i]<arr[start]){
                count++;
            }
        }

        // place the pivot to it's correct postion
        int temp = arr[count];
        arr[count]=arr[start];
        arr[start]=temp;

        // arrange the less than elements to left of pivot and greater than elements to the right of the pivot
        int i=start;
        int j=count+1;
        while(i<=count && j<=end){
            if(arr[i] > arr[count]){
                if(arr[j]<=arr[count]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                else{
                    j++;
                }
            }
            else{
                i++;
            }
        }
        
        // return the pivot element
        return count;
    }
}
