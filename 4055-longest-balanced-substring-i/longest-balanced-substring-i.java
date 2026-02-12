class Solution {
    public int longestBalanced(String s) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0)+1);
                int f = 0;
                int x = map.get(s.charAt(j));
                for(char key : map.keySet()){
                    if(map.get(key) != x)f=1;
                }
                if(f == 0){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        if(ans == Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}