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
//Bhoomika's solution 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1,null);
        ListNode dummy = list3;
        ListNode t1= list1;
        ListNode t2 = list2;
        while(t1 != null && t2 !=null){
            if (t1.val<=t2.val){
                dummy.next = t1;
                t1=t1.next;
                
            }
            else if (t2.val<t1.val){
                dummy.next = t2;
                t2=t2.next;
            }
            dummy=dummy.next;
        }

        if (t1!=null){
            dummy.next = t1;
        }
        else if (t2!=null){
            dummy.next = t2;
        }
        return list3.next;
        
    }
}