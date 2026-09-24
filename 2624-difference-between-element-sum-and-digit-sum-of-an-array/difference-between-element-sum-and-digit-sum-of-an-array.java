class Solution {
    public int differenceOfSum(int[] nums) {
        int dSum = 0, sum = 0;
        for(int val : nums){
            sum += val;
            while(val > 0){
                dSum += val % 10;
                val /= 10;
            }
        }
        return Math.abs(dSum - sum);
    }
}