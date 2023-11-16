package Stacks;

public class StacksArray {
    private int data[];
    private int top;

    StacksArray(){
        data = new int[10];
        top=-1;
    }

    StacksArray(int capacity){
        data = new int[capacity];
        top=-1;
    }

    public void push(int element){
        if(data.length==size()){
            return;
        }
        top++;
        data[top]=element;
    }

    public int top(){
        if(size()==0){
            return Integer.MIN_VALUE;
        }
        
        return data[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int size(){
        return top+1;
    }

    public int pop(){
        if(size()==0){
            return Integer.MIN_VALUE;
        }
        int tp = top();
        top--;
        return tp;
    }


}

class StackUse{
    public static void main(String[] args) {
        StacksArray stack = new StacksArray();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
    }
}