// this is leetcode 147

class Solution {
    public ListNode insertionSortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        // st = sorted list tail
        ListNode temp = head.next;
        ListNode st = head;

        while(temp != null){
            if(temp.val >= st.val){
                st = temp;
                temp = temp.next;
                continue;
            }
            st.next = temp.next;

            ListNode t1 = head;
            ListNode pre = null;

            while(t1 != st.next){
                if(temp.val <= t1.val){
                    break;
                }
                pre = t1;
                t1 = t1.next;
            }
            if(pre == null){
                temp.next = head;
                head = temp;
            }else{

                temp.next = pre.next;
                pre.next = temp;
            }
            temp = st.next;
        }
        return head;
    }
}