class Solution {
    // Intution -> First make an array having pair consists digit and count of characters in string, then use only brute force.

    // Default function
    public String countAndSay(int n) {
        int temp=1;
        String ans="1";
        while(temp != n){
            List<ArrPair> ll = map(ans);
            ans="";
            for(ArrPair p:ll){
                ans+=p.count;
                ans+=p.dig;
            }
            //System.out.println(temp +" -> "+ans);
            temp++;
        }
        return ans;
    }

    class ArrPair{
        int dig;
        int count;
        public ArrPair(int dig,int count){
            this.dig=dig;
            this.count=count;
        }
    }
    // this function map the pair of charcters needed in problem in the List.
    public List<ArrPair> map(String s){
        List<ArrPair> ll = new ArrayList<>();
        int c=1 ;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch == s.charAt(i+1)){
                c++;
            }
            else{
                ll.add(new ArrPair(ch-'0',c));
                c = 1;
            }
        }
        // to add the last pair for last ele.
        ll.add(new ArrPair(s.charAt(s.length() - 1) - '0', c));
        return ll;
    }
}