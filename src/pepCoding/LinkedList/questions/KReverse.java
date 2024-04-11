package src.pepCoding.LinkedList.questions;


//INCOMPLETE!
public class KReverse {

    public static class LinkedList{
        Main.ListNode head;
        Main.ListNode tail;
        int size;

        void addLast(int val){
            Main.ListNode temp = new Main.ListNode();
            temp.val = val;
            temp.next = null;
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next=null;
                tail = temp;
            }
            size++;

        }
    }

    public static void main(String[] args) {
            Main.ListNode L1head3 = new Main.ListNode(4,null);
            Main.ListNode L1head2 = new Main.ListNode(3,L1head3);
            Main.ListNode L1head1 = new Main.ListNode(2,L1head2);
            Main.ListNode L1head = new Main.ListNode(1,L1head1);
            Main.ListNode head3 = new Main.ListNode(4,L1head);
            Main.ListNode head2 = new Main.ListNode(3,head3);
            Main.ListNode head1 = new Main.ListNode(2,head2);
            Main.ListNode head = new Main.ListNode(1,head1);
            int k = 3;

            Main.display(head);
            System.out.println(KReversed(head, k));
            Main.display(head);
        }

    private static boolean KReversed(Main.ListNode head, int k) {
        LinkedList prev = new LinkedList();

//        while(this.size > 0){
//            Main.ListNode curr = new Main.ListNode();
//
//            for (int i =0; i< k; i++){
//                int val = this.getFirst();
//                this.removeFirst();
//                curr.addFirst(val);
//            }
//        }

        return false;
    }

}