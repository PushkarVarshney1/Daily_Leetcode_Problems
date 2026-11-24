class ProductOfNumbers {
    ArrayList<Integer> ll;
    public ProductOfNumbers() {
        ll = new ArrayList<>();
    }
    
    public void add(int num) {
        ll.add(num);
    }
    
    public int getProduct(int k) {
        int p = 1;
        for(int i=ll.size()-1; i>=0; i--){
            p *= ll.get(i);
            k--;
            if(k == 0)break;
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */