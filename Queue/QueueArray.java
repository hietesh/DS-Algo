package Queue;

public class QueueArray {
    private int data[];
    private int front;
    private int rear;
    private int size;
    
    QueueArray(){
        data  = new int[10];
        front = -1;
        rear  = -1;
        size  = 0;
    }

    QueueArray(int capacity){
        data  = new int[capacity];
        front = -1;
        rear  = -1;
        size  = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int front(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        return data[front]; 
    }

    void enqueue(int element){
        if(size==data.length){
            return;
        }
        if(size==0){
            front = 0;
        }
        rear++;
        size++;
        if(rear==data.length){
            rear=0;
        }
        data[rear] = element;
    }

    int dequeue(){
        int temp = data[front];
        front++;
        if(front==data.length){
            front=0;
        }
        size--; 
        if(size==0){
           front = -1;
           rear  = -1;
        }
        return temp;
    }

}
