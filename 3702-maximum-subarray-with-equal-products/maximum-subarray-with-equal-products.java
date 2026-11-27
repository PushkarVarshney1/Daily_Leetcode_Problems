class Solution {
    public int maxLength(int[] nums) {
        int best = 2, lo = 0, product = 1;
        for (int hi = 0; hi < nums.length; hi++) {
            int x = nums[hi];
            while (gcd(product, x) > 1)
                product /= nums[lo++];
            product *= x;
            best = Math.max(best, hi - lo + 1);
        }
        return best;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}