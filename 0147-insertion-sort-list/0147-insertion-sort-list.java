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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy =new ListNode(0);
        ListNode q=head;
        while(q!=null){
            ListNode n=q.next;
            ListNode prev=dummy;
            while(prev.next!=null && prev.next.val<q.val){
                prev=prev.next;
            }
            q.next=prev.next;
            prev.next=q;
        q=n;
            }
            return dummy.next;
        }
    }
