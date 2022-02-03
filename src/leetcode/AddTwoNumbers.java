package leetcode;

import leetcode.common.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode res = addTwoNumbers(l1, l2);

        while(res != null) {
            System.out.print(res.val + "\t");
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode step = result;
        int carry = 0 ;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val ;
            int y = l2 == null ? 0 : l2.val ;
            System.out.println(x + ", " + y);
            int sum = x + y + carry;
            carry = (x + y) / 10 ;
            step.next = new ListNode(sum % 10);
            step = step.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry > 0) {
            step.next = new ListNode(carry);
        }

        return result.next;
    }
}
