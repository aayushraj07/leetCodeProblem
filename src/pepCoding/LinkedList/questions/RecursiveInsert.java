package src.pepCoding.LinkedList.questions;

public class RecursiveInsert {
    public static void main(String[] args) {
        Main.ListNode fourth = new Main.ListNode(3,null);
        Main.ListNode third = new Main.ListNode(2,fourth);
        Main.ListNode second = new Main.ListNode(1,third);
        Main.ListNode head = new Main.ListNode(0,second);

        int val = 4;
        int index = 3;
        int count = 0;
        insert(val,index, count,head);
    }

    private static void insert(int val, int index, int count, Main.ListNode head) {
        if(count == index){
            return;
        }
        while(count != index){
            count++;

            head = head.next;
        }
    }

}
