class Solution {
    public int concatenatedBinary(int n) {
        // Simulation
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= n; i++){
            s.append(Integer.toBinaryString(i)); // gives binary for all number
        }
        String sb = s.toString();
        int num = 0;
        int mod = 1_000_000_007;
        for(int i = 0; i < sb.length(); i++){
            num = (num * 2 + (sb.charAt(i) - '0')) % mod;
        }

        return num;
    }
}