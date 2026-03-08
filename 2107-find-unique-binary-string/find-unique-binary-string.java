class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<String> ll = new ArrayList<>();
        for(String s : nums) ll.add(s);

        int l = nums[0].length();
        return perm("", l, 0, ll);
    }

    public String perm(String ans, int l, int idx, ArrayList<String> ll){
        if(idx == l){
            if(!ll.contains(ans)) return ans;
            return null;
        }
        String left = perm(ans + "0", l, idx + 1, ll);
        if(left != null) return left;

        return perm(ans + "1", l, idx + 1, ll);
    }
}