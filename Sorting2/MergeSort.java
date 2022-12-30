package Sorting2;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void mergeSort(int[] arr,int start,int end) {
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        sort(arr,start,mid,mid+1,end);
    }

    private static void sort(int[] arr, int ik, int k,int l ,int j) {
        int temp[] = new int[1000000];
        int count = 0;
        int start=ik,end=j,mid=k,mid1=l;
        while(start<=mid && mid1<=end){
           if(arr[start] < arr[mid1]){
                temp[count]=arr[start];
                start++;
           }
           else{
                temp[count]=arr[mid1];
                mid1++;
           }
           count++;
        }

        while(mid1<=end){
            temp[count] = arr[mid1];
            mid1++;
            count++;
        }

        while(start<=mid){
            temp[count] = arr[start];
            start++;
            count++;
        }
        count=0;
        // move all the elements in the original array
        for(int i=ik;i<=j;i++,count++){
            arr[i]=temp[count];
        }
    }
}
