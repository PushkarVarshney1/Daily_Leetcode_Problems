class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i : nums){
            String s = Integer.toString(i);
            for(int j=0; j<s.length(); j++){
                ll.add(s.charAt(j) - '0');
            }
        }
        int[] ans = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            ans[i] = ll.get(i);
        }
        return ans;
    }
}