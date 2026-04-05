//Bhoomika
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
        ListNode cur = head;
        int count =0;
        while(cur!=null){
            if (count==index){
                return cur.val;
            }
            cur = cur.next;
            count++;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode n = new ListNode(val);
        if (head == null){
            head = tail = n;
        }
        else {
            n.next = head;
            head = n;
        }
        
    }

    public void insertTail(int val) {
        ListNode t = new ListNode(val);
        if (tail == null){
            head = tail = t;
        }
        else{
            tail.next = t;
            tail = t;
        }

    }

    public boolean remove(int index) {
        if (head == null || index < 0) return false;
        if (index==0){
            head = head.next;
            if (head==null){
                tail = null;
            }
            return true;
        }
        int count =0;
        ListNode cur  = head;
        while(cur.next!=null){
            if (count == index-1){
                ListNode todl = cur.next;
                cur.next = todl.next;
                // cur.next = cur.next.next
                if (todl == tail){
                    tail = cur;
                }
                return true;
            }
                count++;
                cur = cur.next;
        }




        return false;


        
    }

    public ArrayList<Integer> getValues() {
        //ll to array
        ListNode cur  = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(cur!=null){
            arr.add(cur.val);
            cur = cur.next;

        }
        return arr;

    }
}
