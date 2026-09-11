class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.put(digits[i], map.getOrDefault(digits[i], 0)+ 1);
        }
        int count = 0;
        // Last digit must be even
        for (int last = 0; last <= 8; last += 2) {
            if (!map.containsKey(last))
                continue;

            // Middle digit
            for (int mid = 0; mid <= 9; mid++) {
                if (!map.containsKey(mid))
                    continue;
                // Use one copy of last and mid
                int available = map.get(mid);
                if (mid == last)
                    available--;
                if (available <= 0)
                    continue;

                // First digit: 1-9, cannot be 0
                for (int first = 1; first <= 9; first++) {
                    if (!map.containsKey(first))
                        continue;
                    int required = 1;
                    if (first == last)
                        required++;
                    if (first == mid)
                        required++;
                    if (map.get(first) >= required)
                        count++;
                }
            }
        }
        return count;
    }
}