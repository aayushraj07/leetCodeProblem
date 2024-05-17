package src.pepCoding.BinaryTree;

import java.util.Stack;

public class BinaryTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static Node constructTree(Integer[] arr) {
        if (arr.length == 0) return null;

        Node root = new Node(arr[0], null, null);
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        int idx = 1;
        while (!stack.isEmpty()) {
            Pair top = stack.peek();
            if (top.state == 1) {
                // left child
                if (arr[idx] != null) {
                    Node leftNode = new Node(arr[idx], null, null);
                    top.node.left = leftNode;
                    stack.push(new Pair(leftNode, 1));
                }
                top.state++;
                idx++;
            } else if (top.state == 2) {
                // right child
                if (arr[idx] != null) {
                    Node rightNode = new Node(arr[idx], null, null);
                    top.node.right = rightNode;
                    stack.push(new Pair(rightNode, 1));
                }
                top.state++;
                idx++;
            } else {
                stack.pop();
            }
        }
        return root;
    }

    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "";
        str += node.left  == null? "." :node.left.data + " ";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." :node.right.data + "";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
    }

    public static int sum(Node node){
        if(node==null){
            return 0;
        }
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm = lsm + rsm + node.data;
        return tsm;
    }

    public static int max(Node node){
        if(node == null){
//            return 0;
            return Integer.MIN_VALUE;
        }
        int lsm = max(node.left);
        int rsm = max(node.right);
        int maxt = Math.max(node.data, Math.max(lsm,rsm));
        return maxt;
    }

    public static int height(Node node){
        if(node == null){
            return -1;
//            -1 is for edges and 0 is for node calc.
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh,rh) + 1;
        return th;
    }

    public static void traversal(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.data + "in Pre-Order");
        traversal(node.left);
        System.out.println(node.data + "in In-Order");
        traversal(node.right);
        System.out.println(node.data + "in Post-Order");
    }


    public static void main(String[] args) throws Exception{
        Integer[] arr = {50, 25, 12 ,null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        st.push(rtp);
        int index =0;
        while(st.size() > 0){
            Pair top =st.peek();
            if(top.state == 1){
                index++;
                if(arr[index] != null){
                    Node ln = new Node(arr[index], null,null);
                    top.node.left = ln;
                    Pair lp = new Pair(ln, 1);
                    st.push(lp);
                }
                top.state++;
            }else if(top.state == 2){
                index++;
                if(arr[index] != null) {
                    Node rn = new Node(arr[index], null, null);
                    top.node.right = rn;
                    Pair rp = new Pair(rn, 1);
                    st.push(rp);
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        display(root);
        traversal(root);
    }
}
