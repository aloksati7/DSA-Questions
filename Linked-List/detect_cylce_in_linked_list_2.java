// this is leetcode 142

ublic class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        boolean found = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                found = true;
                slow = head;
                break;
            }
        }
        if(found != true){
            return null;
        }

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}