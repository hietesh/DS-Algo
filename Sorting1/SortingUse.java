package Sorting1;

import java.util.Scanner;

public class SortingUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // selectionSort(arr);
        //bubbleSort(arr);
        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    // swap adjacent elements until last one is sorted
    private static void bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // logic is to find minimum and swap it with i'th position (n^2 approach)
    private static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                } 
            }
            // swap it with the current position element
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    // insertion sort
    public static void insertionSort(int arr[]){
       int n = arr.length;
       for(int i=1;i<n;i++){
            int pos = i;
            while(pos > 0 && arr[pos]<arr[pos-1]){
                int temp = arr[pos];
                arr[pos]=arr[pos-1];
                arr[pos-1]=temp;
                pos--;
            }
       }
    }
}
