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
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode l1 = head;
        ListNode mid = middle(l1);
        // ListNode l2 = head;
        ListNode l2 = reverse(mid.next);
        mid.next=null;
        while(l1!=null && l2!=null){
            ListNode temp = l1.next;
            ListNode temp2 = l2.next;
            l1.next=l2;
            l2.next=temp;
            l1=temp;
            l2=temp2;

        }
 
    }
}
