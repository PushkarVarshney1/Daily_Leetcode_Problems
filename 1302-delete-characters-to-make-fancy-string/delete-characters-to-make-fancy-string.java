class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder() ;
        int c=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<=2)ans.append(s.charAt(i));
        }
        ans.append(s.charAt(s.length()-1));
        return ans.toString();
    }
}