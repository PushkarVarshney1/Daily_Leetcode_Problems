class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int x = Math.min(9, sum);
            sb.append(x);
            sum -= x;
            num--;
        }
        return sum == 0 ? sb.toString() : "";
    }
}