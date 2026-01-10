class Solution {
    public long maxStrength(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        long product = 1;
        int zero = 0;
        int pos = 0;

        for(int val : nums){
            if(val > 0){
                product *= val;
                pos++;
            }
            else if(val < 0){
                neg.add(val);
            }
            else{
                zero++;
            }
        }

        // sort negatives by absolute value descending
        neg.sort((a,b) -> Math.abs(b) - Math.abs(a));

        // take negatives in pairs
        int i = 0;
        while(i + 1 < neg.size()){
            product *= neg.get(i) * neg.get(i+1);
            i += 2;
        }

        if(pos == 0 && neg.size() < 2){
            // only one negative exists
            if(neg.size() == 1){
                // if zero exists, choose 0 instead of negative
                return zero > 0 ? 0 : neg.get(0);
            }
            // only zeros
            return 0;
        }

        return product;
    }
}
