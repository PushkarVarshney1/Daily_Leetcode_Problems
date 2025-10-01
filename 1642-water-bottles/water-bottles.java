class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles >= numExchange){
            int x=numBottles / numExchange;
            ans += x;
            numBottles = x + (numBottles % numExchange);
        }
        return ans;
    }
}