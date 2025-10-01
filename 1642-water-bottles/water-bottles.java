class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles >= numExchange){
            int x=numBottles / numExchange;
            if(numBottles % numExchange == 0)
            { 
                ans += x;
                numBottles = x;
            }
            else {
                
                ans += x;
                numBottles = x + (numBottles % numExchange);
            }
        }
        return ans;
    }
}