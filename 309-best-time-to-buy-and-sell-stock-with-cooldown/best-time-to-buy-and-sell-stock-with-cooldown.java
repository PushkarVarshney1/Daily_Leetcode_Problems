class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int buy = -arr[0];
        int sell = 0;
        int pr = 0;
        for(int i=1; i<n; i++){
            int a = buy;
            int b = sell;
            int c = pr;
            buy = Math.max(a, c - arr[i]);
            sell = a + arr[i];
            pr = Math.max(c, b);
        }
        return Math.max(sell, pr);
    }
}