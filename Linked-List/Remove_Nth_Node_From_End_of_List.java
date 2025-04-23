// this id leetcode 19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode sec = head;
        while(n > 0 && sec != null){
            n--;
            sec = sec.next;
        }
        if(n != 0){
            return head;
        }

        if(sec == null){
            ListNode temp = head;
            head = temp.next;
            temp.next = null;
            return head;
        }
        ListNode pre = null;
        while(sec != null){
            sec = sec.next;
            pre = first;
            first = first.next;

        }
        pre.next = first.next;
        first.next = null;
        return head;

    }
}