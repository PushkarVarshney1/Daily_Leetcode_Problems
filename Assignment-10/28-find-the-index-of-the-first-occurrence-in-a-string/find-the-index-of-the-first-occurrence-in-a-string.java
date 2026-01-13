class Solution {
    public int strStr(String haystack, String needle) {
        int s = haystack.length();
        int targ = needle.length();
        for(int i=0; i<s; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = 1;
                for(int j=i+1; j<s && j<i+targ; j++){
                    if(haystack.charAt(j) != needle.charAt(k))break;
                    k++;
                }
                if(targ == k)
                return i;
            }
        }
        return -1;
    }
}