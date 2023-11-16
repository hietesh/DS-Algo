package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> children;
    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}




class TreeUse{
    public static void main(String[] args) {
        // TreeNode<Integer> root = new TreeNode<Integer>(4);

        // TreeNode<Integer> node1 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        // TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        // TreeNode<Integer> node4 = new TreeNode<Integer>(6);
        
        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        // System.out.println();
        TreeNode<Integer> root = takeInput();
    }

    private static TreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter next node data");
        int n=sc.nextInt();

        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter Number of Children "+n);

        int childCount = sc.nextInt();

        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        sc.close();
        return root;
    }

}
