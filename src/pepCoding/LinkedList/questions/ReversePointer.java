package src.pepCoding.LinkedList.questions;

public class ReversePointer {
    public static void main(String[] args) {
        Main.ListNode L1head3 = new Main.ListNode(14,null);
        Main.ListNode L1head2 = new Main.ListNode(8,L1head3);
        Main.ListNode L1head1 = new Main.ListNode(7,L1head2);
        Main.ListNode L1head = new Main.ListNode(5,L1head1);
        Main.ListNode head3 = new Main.ListNode(4,L1head);
        Main.ListNode head2 = new Main.ListNode(3,head3);
        Main.ListNode head1 = new Main.ListNode(2,head2);
        Main.ListNode head = new Main.ListNode(1,head1);

        reversePR(head);

    }

    private static void reversePRHelper(Main.ListNode head){

    }

    private static void reversePR(Main.ListNode head) {
        reversePRHelper(head);
    }
}
