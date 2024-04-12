package src.pepCoding.Tree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static src.pepCoding.Tree.Tree.display;

public class MaxGenericTree {

    public static int max(Tree.Node node) {
        int max = Integer.MIN_VALUE;
        for (Tree.Node child : node.children) {
            int cm = max(child);
            max = Math.max(cm, max);
        }
        max = Math.max(node.data, max);
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        Tree.Node root = Tree.construct(arr);
        int m = max(root);
        System.out.println(m);
//        Tree.display(root);
    }
}
