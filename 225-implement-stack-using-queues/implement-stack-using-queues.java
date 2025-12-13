class MyStack {
    List<Integer> ll ;
    public MyStack() {
        ll = new ArrayList<>();
    }
    
    public void push(int x) {
        ll.add(x);
    }
    
    public int pop() {
        return ll.remove(ll.size()-1);
    }
    
    public int top() {
        return ll.get(ll.size()-1);
    }
    
    public boolean empty() {
        if(ll.size() == 0)return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */