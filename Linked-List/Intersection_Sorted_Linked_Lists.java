 // https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1


 class Solution {
     public static Node findIntersection(Node head1, Node head2) {
         // code here.
         Node ans = new Node(-1);
         Node tail = ans;
         Node t1 = head1;
         Node t2 = head2;

         while(t1 != null && t2 != null){
             if(t1.data == t2.data){

                 tail.next = new Node(t1.data);
                 tail = tail.next;

                 t1 = t1.next;
                 t2 = t2.next;
             }
             else if(t1.data < t2.data){
                 t1 = t1.next;
             }else{
                 t2 = t2.next;
             }
         }

         Node temp = ans;
         ans = ans.next;
         temp.next = null;
         return ans;
     }
 }