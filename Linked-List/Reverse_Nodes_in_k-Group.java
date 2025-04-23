// this is leetcode 25
class Solution {
    public int length(ListNode head){
        int counter = 0;
        while(head != null){
            counter++;
            head = head.next;
        }
        return counter;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = length(head);
        int groups = n/k;
        ListNode preHead = null;
        ListNode currHead = head;
        ListNode ans = null;
        for(int i = 0; i< groups; i++){
            ListNode pre = null;
            ListNode curr = currHead;
            ListNode nextNode = null;
            for(int j = 0; j<k; j++){
                nextNode = curr.next;
                curr.next = pre;
                pre = curr;
                curr = nextNode;
            }

            if(preHead == null){
                ans = pre;
            }else{
                preHead.next = pre;
            }
            preHead = currHead;
            currHead = curr;
        }
        preHead.next = currHead;
        return ans;
    }
}