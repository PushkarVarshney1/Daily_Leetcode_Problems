class Fancy {
    static ArrayList<Long> ll;
    static long add = 0;
    static long mul = 1;
    static long mod = 1_000_000_007;

    public Fancy() {
        ll = new ArrayList<>();
    }
    
    // Fermat's Theorem for modulo of multiply of (1 / mul) while appending in arrayList
    // This can be solved by power(mul , mod-2)
    public void append(long val) {
        ll.add((((val - add + mod) % mod) * power(mul , mod-2)) % mod);
    }
    
    public void addAll(long inc) {
        add = (add + inc) % mod;
    }
    
    public void multAll(long m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }
    
    public long getIndex(int idx) {
        if(idx >= ll.size()) return -1;
        return (ll.get(idx)*mul + add) % mod;
    }
    static long power(long a , long b){
        long res = 1;
        while(b > 0){
            if((b & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}