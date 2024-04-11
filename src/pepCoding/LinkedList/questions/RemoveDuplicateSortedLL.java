package src.pepCoding.LinkedList.questions;
import src.pepCoding.LinkedList.questions.Main;

import static src.pepCoding.LinkedList.questions.Main.display;

public class RemoveDuplicateSortedLL {


    public static void main(String[] args) {
        Main.ListNode head3 = new Main.ListNode(4,null);
        Main.ListNode head2 = new Main.ListNode(2,head3);
        Main.ListNode head1 = new Main.ListNode(2,head2);
        Main.ListNode head = new Main.ListNode(1,head1);
        display(head);
        removeDup(head);
//        removeDup2(head);
        display(head);
    }

    private static Main.ListNode removeDup2(Main.ListNode head) {

        Main.ListNode dummy = new Main.ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;

        Main.ListNode current = dummy;


        while (current.next != null && current.next.next != null) {
            if (current.next.val == current.next.next.val) {
                int duplicateValue = current.next.val;

                // Skip all nodes with the duplicate value
                while (current.next != null && current.next.val == duplicateValue) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next; // Move to the next node
            }
        }

        return dummy.next;

    }

    private static Main.ListNode removeDup(Main.ListNode head) {
        Main.ListNode temp = head;

        while(temp != null && temp.next!=null){
            int duplicate = 101;
            if(temp.next.val == temp.next.next.val){
                duplicate = temp.next.val;
                temp.next  = temp.next.next.next;
            }
            if(temp.next.val == duplicate){
                temp.next = temp.next.next;
            }
        temp = temp.next;
        }
        return head;
    }

}
