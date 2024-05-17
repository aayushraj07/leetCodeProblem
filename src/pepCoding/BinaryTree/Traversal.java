package src.pepCoding.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
    public static void traversal(BinaryTree.Node node){
        if (node == null){
            return;
        }
        System.out.println(node.data + "in Pre-Order");
        traversal(node.left);
        System.out.println(node.data + "in In-Order");
        traversal(node.right);
        System.out.println(node.data + "in Post-Order");
    }

    private static void levelOrderTraversal(BinaryTree.Node node) {
        Queue<BinaryTree.Node> mq = new ArrayDeque<>();
        mq.add(node);

        while(mq.size()>0){
            int count = mq.size();
            for(int i = 0; i< count ; i++){
                node = mq.remove();
                System.out.print(node.data + " ");

                if(node.left !=null){
                    mq.add(node.left);
                }
                if(node.right!=null){
                    mq.add(node.right);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception{
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        BinaryTree.Node root = BinaryTree.constructTree(arr);
        traversal(root);
        levelOrderTraversal(root);
    }



}
