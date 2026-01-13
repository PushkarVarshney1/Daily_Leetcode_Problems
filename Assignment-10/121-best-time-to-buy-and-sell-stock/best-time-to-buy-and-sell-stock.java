class Solution {
    public int maxProfit(int[] prices) {
        int kharida = Integer.MAX_VALUE;
		int ans = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < kharida) {
				kharida = prices[i];
			}
			else if(prices[i] - kharida > ans)ans = prices[i] - kharida;
		}
        return ans;
    }
}