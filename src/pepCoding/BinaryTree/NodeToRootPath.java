package src.pepCoding.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

import static src.pepCoding.BinaryTree.BinaryTree.constructTree;

public class NodeToRootPath {

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Stack<BinaryTree.Pair> st = new Stack<>();
        BinaryTree.Node root = constructTree(arr);
        int target = 62;
        System.out.println(find(root, target));
        System.out.println(path);
    }

    static ArrayList<Integer> path = new ArrayList<>();
    private static boolean find(BinaryTree.Node node, int data) {
        if(node == null){
            return false;
        }

        if(node.data == data){
            path.add(node.data);
            return true;
        }
        boolean filc = find(node.left, data);
        if(filc){
            path.add(node.data);
            return true;
        }
        boolean firc = find(node.right, data);
        if(firc){
            path.add(node.data);
            return true;
        }

        return false;
    }

}
