package src.pepCoding.LinkedList.questions;

public class KthFromEnd {

    public static class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node h4 = new Node(4,null);
        Node h3 = new Node(3,h4);
        Node h2 = new Node(2,h3);
        Node h1 = new Node(1,h2);
        int k = 2;
        System.out.println(findKthLast(h1,k));
    }

    private static int findKthLast(Node h1, int k) {
        int ind =0;
        int size = 0;
        Node h1temp = h1;
        while(h1temp != null){
            h1temp = h1temp.next;
            size++;
        }
        for (int i = 0; i < size-k; i++){
            h1 = h1.next;
        }

        return h1.value;
    }
}
