class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumE = 0; // even sum
        int sumO = 0; // even odd
        for(int i=1; i<=2*n; i++){
            if(i%2 == 0)
            sumE += i;
            else 
            sumO += i;
        }

         // GCD optimal
        int divisor=Math.min(sumE , sumO);
        int dividend=Math.max(sumE , sumO);
        while(dividend % divisor != 0){
            int temp=dividend;
            dividend=divisor;
            divisor=temp % divisor;
        }
        return divisor;

   }
}