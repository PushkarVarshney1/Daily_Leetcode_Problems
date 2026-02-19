class Solution {
    // "00011100" --> [3 zeroes, 3 ones, 2 zeroes] --> [3,3,2] 
    //  Ans --> min(3,3) + min(3,2) = 5 Total Substrings
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int prev = 0;
        int curr = 1;
        int ans = 0;
        int i=1;
        while(i < n){
            char ch = s.charAt(i);
            if(ch == s.charAt(i-1)){
                curr++;
            }
            else{
                ans += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
            i++;
        }
        ans += Math.min(curr, prev); // to add last curr and prev
        return ans;
    }
}                                