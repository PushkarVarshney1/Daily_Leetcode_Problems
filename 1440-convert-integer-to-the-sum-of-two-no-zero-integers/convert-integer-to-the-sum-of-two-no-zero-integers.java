class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++)
        {
            int left = i;
            int right= n-left;
            // if left and right do not contains 0 , return left and right.
            if(!String.valueOf(left).contains("0")&&!String.valueOf(right).contains("0"))
            return new int[] {left,right};
        }
        return new int[0];
    }
}