package src.pepCoding.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Practice {

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Stack<Integer> st = new Stack<>();
        BinaryTree.Node root = BinaryTree.constructTree(arr);
        ArrayList<Integer> path = findK(root, 30);
    }

    static ArrayList<Integer> path = new ArrayList<>();
    private static ArrayList<Integer> findK(BinaryTree.Node root, int i) {
        if(root == null){
            return new ArrayList<>();
        }

        if(root.data == i){
            path.add(root.data);
            return path;
        }
        findK(root.left, i);
        findK(root.right, i);

        return path;
    }

}
