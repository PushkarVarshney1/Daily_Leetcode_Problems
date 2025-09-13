class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0 , left=0;
        // sliding Window
        for(int right =0; right<s.length(); right++){
            char ch=s.charAt(right);
            // condition if character is getting duplicate
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);
            ans=Math.max(ans , right-left+1);
        }
        return ans;
    }
}