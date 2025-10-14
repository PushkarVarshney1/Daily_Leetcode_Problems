class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())return false;

        // arr1 to store the frequency of char in s1.
        int []arr1 = new int[26];
        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            arr1[ch - 'a']++;
        }
        // freq[] to store the frequency of char in s2.
        int []freq = new int[26];
        int size = s1.length(); // size of window to iterate in s2
        int st=0;
        for(int i=0; i<s2.length(); i++){
            char ch=s2.charAt(i);
            freq[ch-'a']++;
            // condition goes in when i becomes greater than Wndsize then decreases at each step.
            if(i >= size){ 
                freq[s2.charAt(st) - 'a']--;
                st++;
            }
            // when both Arrays becomes equal of same windowsize means permutation occurs
            if(Arrays.equals(arr1 , freq))return true;
        }
        return false;
    }
}