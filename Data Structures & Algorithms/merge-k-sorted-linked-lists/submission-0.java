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
//Bhoomika's solution approach 1
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }
        ListNode head = lists[0];
        for (int i =1;i<lists.length;i++){
            head = merge(head,lists[i]);
        }
        return head;

    }

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode l3 = new ListNode(0);
        ListNode cur= l3;
        ListNode t1 = l1;
        ListNode t2 = l2;


        while(t1!=null && t2!=null){
            if (t1.val<=t2.val){
                cur.next = t1;
                t1 = t1.next;
                
            }
            else {
                cur.next = t2;
                t2 = t2.next;
            }
            cur = cur.next;

        }
        while(t1!=null){
            cur.next = t1;
            t1 = t1.next;
            cur = cur.next;
        }
        while (t2!=null){
            cur.next = t2;
            t2 = t2.next;
            cur = cur.next;

        }

        return l3.next;

    }

}
