class Solution {
    public int maximum69Number (int num) {
        // if(num % 9 == 0)return num;
        String s=Integer.toString(num);
        String ans="";
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '6' && c==0){
                ch='9';
                c=1;
            }
            ans+=ch;
        }
        return Integer.parseInt(ans);
    }
}