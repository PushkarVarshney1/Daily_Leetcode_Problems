class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumE=0 ,  c=0;
        for(int i=2;i<Integer.MAX_VALUE && c<n;i+=2){
            sumE+=i;
            c++;
        }
        c=0;
        int sumO=0  ;
        for(int i=1;i<Integer.MAX_VALUE && c<n;i+=2){
            sumO+=i;
            c++;
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