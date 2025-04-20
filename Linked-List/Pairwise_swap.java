//https://www.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/0
class Solution {

    public Node pairwiseSwap(Node head) {

        Node first = head;
        Node pre = null;
        while(first != null && first.next != null){
            Node sec = first.next;
            first.next = sec.next;
            sec.next = first;
            if(pre == null){
                head = sec;
            }else{
                pre.next = sec;
            }
            pre = first;
            first = first.next;
        }
        return head;
    }
}