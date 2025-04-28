// https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

class Solution {
    Node sortedInsert(Node head, int key) {
        Node newnode = new Node(key);
        Node pre = null;
        Node temp = head;

        while(temp != null){
            if(temp.data >= key){
                break;

            }
            pre = temp;
            temp = temp.next;
        }

        if(pre == null){
            newnode.next = head;
            head = newnode;
        }else{
            newnode.next = pre.next;
            pre.next = newnode;
        }
        return head;
    }
}