package src.pepCoding.LinkedList.questions;

public class RotateLL {

    public static void main(String[] args) {
        Main.ListNode head3 = new Main.ListNode(4,null);
        Main.ListNode head2 = new Main.ListNode(3,head3);
        Main.ListNode head1 = new Main.ListNode(2,head2);
        Main.ListNode head = new Main.ListNode(1,head1);
        System.out.println(rotateRight(head,1));
    }

    private static Main.ListNode rotateRight(Main.ListNode head, int k) {

        int size = 0;
        Main.ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for(int i =1; i < size-k; i++){
            temp = temp.next;
        }

        Main.ListNode new1 = temp.next;
        temp.next = null;

        Main.ListNode temp1 = new1;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = head;
        head = new1;

        return head;

    }

}
