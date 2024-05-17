package src.pepCoding.BinaryTree;

public class PrintKLevel {

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        BinaryTree.Node root = BinaryTree.constructTree(arr);
        int k = 2;
        printKLevel(root, k);
    }

    private static void printKLevel(BinaryTree.Node node, int k) {
        if(node == null || k < 0){
            return;
        }
        if(k == 0){
            System.out.print(node.data +" ");
        }

        printKLevel(node.left, k-1);
        printKLevel(node.right, k-1);
    }
}
