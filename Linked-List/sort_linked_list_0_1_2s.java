//https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.



    static Node segregate(Node head) {
        // code here
        Node temp = head;


        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;

        Node oneHead = new Node(-1);
        Node oneTail = oneHead;

        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        while(temp != null){
            Node nextNode = temp.next;
            if(temp.data == 0){
                temp.next = null;
                zeroTail.next = temp;
                zeroTail = zeroTail.next;
            }
            else if(temp.data == 1){
                temp.next = null;
                oneTail.next = temp;
                oneTail = oneTail.next;
            }
            else{
                temp.next = null;
                twoTail.next = temp;
                twoTail = twoTail.next;
            }
            temp = nextNode;
        }

        if(oneHead.next == null){
            zeroTail.next = twoHead.next;
        }else{
            zeroTail.next = oneHead.next;
            oneTail.next = twoHead.next;
        }

        oneHead.next = null;
        twoHead.next = null;

        Node t1 = zeroHead;
        zeroHead = zeroHead.next;
        t1.next = null;

        return zeroHead;
    }
}
