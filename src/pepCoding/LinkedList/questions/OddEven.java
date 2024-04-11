package src.pepCoding.LinkedList.questions;

public class OddEven {

    public static void main(String[] args) {
        Main.ListNode fifth = new Main.ListNode(5, null);
        Main.ListNode fourth = new Main.ListNode(4, fifth);
        Main.ListNode third = new Main.ListNode(3, fourth);
        Main.ListNode second = new Main.ListNode(2, third);
        Main.ListNode head = new Main.ListNode(1, second);
        Main.display(head);
        System.out.println(setOddEven(head));
        Main.display(setOddEven(head));
    }

    private static Main.ListNode setOddEven(Main.ListNode head) {

        Main.ListNode temp = head;
        Main.ListNode odd = new Main.ListNode();
        Main.ListNode even = new Main.ListNode();
        Main.ListNode oddDummy = odd;
        Main.ListNode evenDummy = even;


        while (temp != null) {
            if (temp.val % 2 != 0) {
                Main.ListNode oddTemp = new Main.ListNode(temp.val);
                odd.next = oddTemp;
                odd = odd.next;
                temp = temp.next;
            } else {
                Main.ListNode evenTemp = new Main.ListNode(temp.val);
                even.next = evenTemp;
                even = even.next;
                temp = temp.next;
            }
        }
        odd.next =evenDummy.next;
        return oddDummy.next;
    }

}
