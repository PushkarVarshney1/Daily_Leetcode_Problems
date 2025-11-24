class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ll = new ArrayList<>();
        int s = 0;
        for(int val:nums){
            s = (s*2 + val)% 5;
            ll.add(s == 0);
        }
        return ll;
    }
}