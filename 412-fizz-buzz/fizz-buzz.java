class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>ll=new ArrayList<>();
        int c3=1 , c5=1;
        for(int i=1;i<=n;i++){
            String s="";
            if(c3 == 3){
                s+="Fizz";
                c3=0;
            }
            if(c5 == 5){
                s+="Buzz";
                c5=0;
            }
            c3++;
            c5++;
            if(s == "")ll.add(Integer.toString(i));
            else
            ll.add(s);
        }
        return ll;
    }
}