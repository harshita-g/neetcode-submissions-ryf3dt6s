class MinStack {
    ArrayList<Integer> stack;
    ArrayList<Integer> minstack;


    public MinStack() {
        stack = new ArrayList<>();
        minstack = new ArrayList<>();
        
    }
    
    public void push(int val) {
        stack.add(val);
        if (minstack.isEmpty()){
            minstack.add(val);
        }
        else{
        minstack.add(Math.min(minstack.get(minstack.size()-1),val));
        }
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
        minstack.remove(minstack.size()-1);
        
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minstack.get(minstack.size()-1);
        
    }
}
