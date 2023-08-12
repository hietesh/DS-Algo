public class DynamicArray {
    private int arr[];
    private int size;
    DynamicArray(){
        arr = new int[5];
        size=0;
    }

    public int size(){
        return size;
    }

    public void add(int val){
        arr[size]=val;
        size++;
    }
    
    

}
