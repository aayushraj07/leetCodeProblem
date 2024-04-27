package src.pepCoding.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsOnGenericTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Tree.Node root = Tree.construct(arr);
        int m = height(root);

        System.out.println(m);

        traversal(root);
    }

    private static int height(Tree.Node node) {
        int ht = -1;
        for(Tree.Node child: node.children){
            int ch = height(child);
            ht = Math.max(ch,ht);
        }
        ht += 1;
        return ht;
    }

    public static void traversal(Tree.Node node){
        System.out.println("Node Pre " + node.data);
        for(Tree.Node child: node.children){
            System.out.println("Edge Pre "+ node.data+ "--" + child.data);
            traversal(child);
            System.out.println("Edge Post "+ node.data+ "--" + child.data);
        }
        System.out.println("Node post " + node.data);
    }
}
