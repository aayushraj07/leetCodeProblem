package src.pepCoding.BinaryTree;

import java.util.ArrayList;

public class PrintNodeKDistance {

    public static void main(String[] args) {
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        BinaryTree.Node node = BinaryTree.constructTree(arr);
        int target =  37;
        int level = 2;
        printKNodesFar(node, target, level);
    }

    private static void printKNodesFar(BinaryTree.Node node, int data, int k) {
        path = new ArrayList<>();
        find(node, data);
        for (int i = 0; i< path.size(); i++){
            printKLevelsDown(path.get(i), k-1,i==0?null:path.get(i-1));
        }
    }

    private static void printKLevelsDown(BinaryTree.Node node, int level, BinaryTree.Node blocker) {
        if(node == null || level < 0 || node == blocker){
            return;
        }
        if(level == 0){
            System.out.println(node.data);
        }

        printKLevelsDown(node.left, level-1,blocker);
        printKLevelsDown(node.right, level-1,blocker);
    }

    static ArrayList<BinaryTree.Node> path = new ArrayList<>();
    public static boolean find(BinaryTree.Node node, int data) {
        if(node == null){
            return false;
        }

        if(node.data == data){
            path.add(node);
            return true;
        }
        boolean filc = find(node.left, data);
        if(filc){
            path.add(node);
            return true;
        }
        boolean firc = find(node.right, data);
        if(firc){
            path.add(node);
            return true;
        }

        return false;
    }

}
