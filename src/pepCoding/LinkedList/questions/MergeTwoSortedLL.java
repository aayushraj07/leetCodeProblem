package src.pepCoding.LinkedList.questions;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        Main.ListNode head3 = new Main.ListNode(4,null);
        Main.ListNode head2 = new Main.ListNode(3,head3);
        Main.ListNode head1 = new Main.ListNode(2,head2);
        Main.ListNode head = new Main.ListNode(1,head1);

        Main.ListNode L1head3 = new Main.ListNode(4,null);
        Main.ListNode L1head2 = new Main.ListNode(3,L1head3);
        Main.ListNode L1head1 = new Main.ListNode(2,L1head2);
        Main.ListNode L1head = new Main.ListNode(1,L1head1);
        Main.display(head);
        System.out.println(MergeSortedLL(head, L1head));
        Main.display(head);
    }

    private static Main.ListNode MergeSortedLL(Main.ListNode l1, Main.ListNode l2) {

        Main.ListNode res = new Main.ListNode(0);
        Main.ListNode currNode = res;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                currNode.next = l2;
                l2 = l2.next;
            }else{
                currNode.next = l1;
                l1 = l1.next;
            }

            currNode = currNode.next;
        }

        while(l1 != null){
            currNode.next = l1;
            l1 = l1.next;
            currNode = currNode.next;
        }
        while(l2 != null){
            currNode.next = l2;
            l2 = l2.next;
            currNode = currNode.next;
        }

        return res.next;
    }
}
