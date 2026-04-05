class LinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode head;
    ListNode tail;

    public LinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {  
        ListNode curr = head;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }
    
    public void insertHead(int val) {
    ListNode node = new ListNode(val, head);
    head = node;
        if (tail == null) {
        tail = node;
        }
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val,null);
        if (tail==null){
            head = node;
            tail= node;
        } 
        else{
            tail.next = node;
            tail = node;
        }
    }

    public boolean remove(int index) {
        if (head==null){
            return false;
        }

        if (index == 0) {
        head = head.next;
        if (head == null) tail = null; // list became empty
        return true;
        }

        int i=0;
        ListNode cur = head;
        while(cur!=null  && i < index - 1){
            cur = cur.next;
        i++;
    }

    if (cur == null || cur.next == null) return false; // out of bounds

    if (cur.next == tail) tail = cur; // removing last node
    cur.next = cur.next.next;
    return true;
}

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }

        return arr;
    }
    
}