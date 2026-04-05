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
        if (head == null || index < 0) return false;

    // remove head
    if (index == 0) {
        head = head.next;
        if (head == null) {   // list became empty
            tail = null;
        }
        return true;
    }

    ListNode cur = head;
    int cnt = 0;

    while (cur.next != null) {
        if (cnt == index - 1) {
            ListNode toDelete = cur.next;
            cur.next = toDelete.next;

            // if we removed the tail, update tail
            if (toDelete == tail) {
                tail = cur;
            }
            return true;
        }
        cnt++;
        cur = cur.next;
    }

    return false;
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