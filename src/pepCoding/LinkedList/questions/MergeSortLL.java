package src.pepCoding.LinkedList.questions;

public class MergeSortLL {


    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5, null);
        ListNode L1head3 = new ListNode(4, tail);
        ListNode L1head2 = new ListNode(3, L1head3);
        ListNode L1head1 = new ListNode(2, L1head2);
        ListNode head = new ListNode(1, L1head1);
        System.out.println(mergeSort(head, tail));
    }

    private static ListNode mergeSort(ListNode head, ListNode tail) {
        if (head == tail) {
            ListNode res = new ListNode();
            ListNode temp = new ListNode();
            temp.val = head.val;
            temp.next = null;

            res.next = temp;
            return res.next;
        }
        ListNode mid = middleNode(head);
        ListNode fsh = mergeSort(head, mid);
        ListNode ssh = mergeSort(mid, tail);
        ListNode cl = MergeSortedLL(fsh, ssh);
        return cl;
    }

    private static ListNode MergeSortedLL(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode currNode = res;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                currNode.next = l2;
                l2 = l2.next;
            } else {
                currNode.next = l1;
                l1 = l1.next;
            }

            currNode = currNode.next;
        }

        while (l1 != null) {
            currNode.next = l1;
            l1 = l1.next;
            currNode = currNode.next;
        }
        while (l2 != null) {
            currNode.next = l2;
            l2 = l2.next;
            currNode = currNode.next;
        }

        return res.next;
    }


    private static ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

}
