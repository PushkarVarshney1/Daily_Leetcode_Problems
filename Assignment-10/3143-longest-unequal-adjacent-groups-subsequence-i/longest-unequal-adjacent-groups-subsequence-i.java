class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<String>();
        
        int pre = groups[0];
        ans.add(words[0]);
        for(int j=1; j<groups.length; j++){
            int curr = groups[j];
            if(curr != pre){
                pre = curr;
                ans.add(words[j]);
            }
        }
        return ans;
        
    }
}