// This is leetcode 2
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null)?l1.val:0;
            int val2 = (l2 != null)?l2.val:0;
            int value = val1 + val2 + carry;
            ListNode newnode = new ListNode(value % 10);
            carry = value/10;
            if(head == null){
                head = newnode;
                temp = newnode;
            }else{
                temp.next = newnode;
                temp = temp.next;
            }

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        return head;
    }
}