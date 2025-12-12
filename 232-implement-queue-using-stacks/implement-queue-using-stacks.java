class MyQueue {
    static ArrayList<Integer> ll ;
    public MyQueue() {
        ll = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        ll.add(x);
    }
    
    public int pop() {
        return ll.remove(0);
    }
    
    public int peek() {
        return ll.get(0);
    }
    
    public boolean empty() {
        if(ll.size() == 0)return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */