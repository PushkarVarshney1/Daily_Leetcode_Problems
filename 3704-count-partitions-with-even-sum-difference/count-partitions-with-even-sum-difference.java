class Solution {
    public int countPartitions(int[] arr) {
        int n = arr.length;
        int c = 0;
        int sum = 0; // total sum
        for(int v: arr){
            sum += v;
        }
        int curr = 0;
        for(int v: arr){
            curr += v;
            int x = Math.abs(curr - (sum - curr));
            if(x % 2 == 0)c++;
        }
        if(c == 0)return 0;
        return c-1;
    }
}