/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode a1=head;
        int i=0;
        while(a1!=null){
            a1=a1.next;
            i++;
        }
           if(n==i){
            return head.next;
        }
        a1=head;
        for(int k=0;k<i-n-1;k++){
            a1=a1.next;
        }
        a1.next=a1.next.next;
        

        return head;
    }
}