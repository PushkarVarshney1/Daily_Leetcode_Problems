class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int st = 0 , ei = 0;
        int ans = 0;
        while(ei < s.length()){
            char ch = s.charAt(ei);
            map.put(ch , map.getOrDefault(ch , 0)+ 1);
            while(map.get(ch) > 1){
                char left = s.charAt(st);
                map.put(left, map.get(left)-1);
                st++;
            }
            ans = Math.max(ans , ei - st + 1);
            ei++;
        }
        return ans;
    }
}