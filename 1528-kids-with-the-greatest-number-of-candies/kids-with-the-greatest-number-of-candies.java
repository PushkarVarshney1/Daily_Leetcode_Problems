class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i : candies){
            if(i + extraCandies >= max)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}