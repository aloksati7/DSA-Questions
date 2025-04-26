// this is leetcode 2487.
class Solution {
    public ListNode removeNodes(ListNode head) {
        // using stack
        //     ListNode temp = head;
        //     Stack<Integer> st = new Stack<>();

        //     while(temp != null){
        //             while(!st.isEmpty() && temp.val > st.peek()){
        //                 st.pop();
        //             }
        //             st.push(temp.val);

        //         temp = temp.next;
        //     }
        //      ListNode newHead = null;
        //      while(!st.isEmpty()){
        //         if(newHead == null){

        //             newHead = new ListNode(st.pop());
        //             newHead.next = null;

        //         }else{
        //        ListNode newnode = new ListNode(st.pop());
        //        newnode.next = newHead;
        //        newHead = newnode;
        //      }
        //      }
        //         return newHead;


// optimize solution
        ListNode newNode = reverse(head);
        ListNode temp = newNode.next;
        ListNode pre = newNode;

        while(temp != null){
            if(temp.val >= pre.val){
                pre = temp;
                temp = temp.next;
            }else{
                pre.next = temp.next;
                temp = temp.next;
            }
        }
        return reverse(newNode);


    }

    //reverse the linked list
    static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode nn = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nn;
        }
        return pre;
    }


}