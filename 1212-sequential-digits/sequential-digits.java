class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ans = new ArrayList<>();
        int l = String.valueOf(low).length();
        int h = String.valueOf(high).length();
        for (int len = l; len <= h; len++) {
            for (int i = 0; i + len <= 9; i++) {
                int x = Integer.parseInt(s.substring(i, i + len));
                if (x >= low && x <= high) {
                    ans.add(x);
                }
            }
        }
        return ans;
    }
}