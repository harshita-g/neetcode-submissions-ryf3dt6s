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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur = new ListNode(-1);
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode l3 = cur;
        while(p1!=null && p2!=null){
            if(p1.val<=p2.val){
                l3.next = p1;
                p1=p1.next;
            }
            else{
                l3.next=p2;
                p2=p2.next;
            }
            l3=l3.next;
            
        }
        while(p1!=null){
            l3.next = p1;
            p1=p1.next;
            l3=l3.next;

        }
        while(p2!=null){
            l3.next = p2;
            p2 = p2.next;
            l3=l3.next;

        }
        

        return cur.next;
        
    }
}