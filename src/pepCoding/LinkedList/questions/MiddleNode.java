package src.pepCoding.LinkedList.questions;

public class MiddleNode {

    public static void main(String[] args) {
        Main.ListNode head3 = new Main.ListNode(4,null);
        Main.ListNode head2 = new Main.ListNode(3,head3);
        Main.ListNode head1 = new Main.ListNode(2,head2);
        Main.ListNode head = new Main.ListNode(1,head1);
        System.out.println(middleNode(head));
    }

    public static int middleNode(Main.ListNode head) {
        Main.ListNode fast = head;
        Main.ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next.next == null){
            slow = slow.next;
        }
        return slow.val;

    }
}
