package LearnBasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/* 
    i/p

    6
    10 5 10 15 10 5
    
    o/p 

    5 2
    10 3
    15 1

 */
public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        showFrequencies(arr);
        sc.close();
    }

    private static void showFrequencies(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //add counts to the hashmaps
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }  
        }
        
        // show the freqeuncies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}