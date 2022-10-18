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
        //selectionSort(arr);
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
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                } 
            }
        }
    }

    // logic is to find minimum and swap it with i'th position (n^2 approach)
    private static void selectionSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            // find min and swap it with i'th position
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;      
                } 
            }
            // swap i with minimum element
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    // insertion sort
    public static void insertionSort(int arr[]){
       int n = arr.length;
       for(int i=1;i<n;i++){
          int temp = arr[i];
          if(arr[i-1]>arr[i]){
            arr[i]=arr[i-1];
          }
          for(int j=0;j<i;j++){

          }           
       } 
    }
}
