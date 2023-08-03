class MinStack {
    LinkedList<Element> stk;
    private class Element {
        int val;
        int min;
        public Element(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    public MinStack() {
        stk = new LinkedList<>();
        
    }
    
    public void push(int val) {
        int minVal;
        if (stk.size() == 0) {
            minVal = val;
        } else {
            int currMin = stk.getFirst().min;
            minVal = val < currMin? val: currMin;
        }
        stk.addFirst(new Element(val, minVal));
    }
    
    public void pop() {
        stk.removeFirst();
    }
    
    public int top() {
        return stk.peekFirst().val;
    }
    
    public int getMin() {
        return stk.peekFirst().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */