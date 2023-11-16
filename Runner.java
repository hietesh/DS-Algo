import java.util.Scanner;

public class Runner{
    public static void quickSort(int[] input,int st, int end) {
		if(st>=end){
			return;
		}
		int pivotIndex = partition(input,st,end);
		quickSort(input, st, pivotIndex-1);
		quickSort(input, pivotIndex+1, end);
	}

	public static int partition(int arr[],int si,int end){
		int i = si;
		int j = end-1;
		int pv = arr[end];

		while(i<j){
			if(arr[i]>pv){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
			else{
				i++;
			}
		}

		int temp = arr[j];
		arr[j] = arr[end];
		arr[end] =temp;

		return pv;
	}

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String args[]) {
        // int n = 00010204;
		int ans[][] = new int[0][]; 
        System.out.println(ans.length);
    }         
}