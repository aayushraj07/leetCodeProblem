package src.pepCoding.LinkedList.questions;

import src.pepCoding.LinkedList.LinkedListIntro;

public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static void main(String[] args) {
        ListNode head3 = new ListNode(4,null);
        ListNode head2 = new ListNode(4,head3);
        ListNode head1 = new ListNode(4,head2);
        ListNode head = new ListNode(1,head1);

        ListNode L1head3 = new ListNode(4,null);
        ListNode L1head2 = new ListNode(3,L1head3);
        ListNode L1head1 = new ListNode(2,L1head2);
        ListNode L1head = new ListNode(1,L1head1);
//        System.out.println(MergeSortedLL(head, L1head));
    }

        public static void display(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val + " -> ");
            temp =temp.next;
        }
        System.out.println("END");
    }
}
