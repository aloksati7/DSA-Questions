// leetcode 234
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode newlistHead = null;

        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(newlistHead == null){
                newlistHead = new ListNode(pre.val);

            }else{
                ListNode newnode = new ListNode(pre.val);
                newnode.next = newlistHead;
                newlistHead = newnode;
            }
        }

        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            if(slow.val != newlistHead.val){
                return false;
            }
            slow = slow.next;
            newlistHead = newlistHead.next;
        }
        return true;

    }