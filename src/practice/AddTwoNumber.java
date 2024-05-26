package src.practice;

public class AddTwoNumber {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
//        give value
        addTwoNumbers(l1,l2);
        addTwoNumbersHelper(l1, l2, 0);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;

        int carry =0;

        while(l1 != null || l2 != null){
            int sum  = 0+carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum %10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if(carry == 1) ptr.next = new ListNode(1);

        return result.next;
    }

//Using recursion

    public static ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
        // Base case: if both lists are null and there is no carry, return null
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        // Calculate the sum and carry
        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;  // Move to the next node
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;  // Move to the next node
        }

        carry = sum / 10;  // Calculate new carry
        sum = sum % 10;    // Get the last digit for the current node

        // Create a new node with the computed sum
        ListNode resultNode = new ListNode(sum);

        // Recursively calculate the next nodes
        resultNode.next = addTwoNumbersHelper(l1, l2, carry);

        return resultNode;
    }
}
