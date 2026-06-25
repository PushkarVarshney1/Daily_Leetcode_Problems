class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        int[] dummy = nums;  
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = i; j < n; j++) {
                if (dummy[j] == target) freq++; 
                int len = j - i + 1;
                if (freq * 2 > len) count++;
            }
        }
        return count;
    }
}