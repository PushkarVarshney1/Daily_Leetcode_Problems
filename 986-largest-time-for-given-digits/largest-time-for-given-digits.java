class Solution {
    String max = "";

    public String largestTimeFromDigits(int[] arr) {
        boolean[] ll = new boolean[4];
        backtrack(arr, new ArrayList<>(), ll);
        return max;
    }

    private void backtrack(int[] arr, List<Integer> cur, boolean[] ll) {
        if (cur.size() == 4) {
            int hour = cur.get(0) * 10 + cur.get(1);
            int min  = cur.get(2) * 10 + cur.get(3);

            if (hour <= 23 && min <= 59) {
                String time = "" + cur.get(0) + cur.get(1) + ":" + cur.get(2) + cur.get(3);
                if (time.compareTo(max) > 0) {
                    max = time;
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (ll[i]) continue;
                ll[i] = true;
    
                cur.add(arr[i]);
                backtrack(arr, cur, ll);
                cur.remove(cur.size() - 1);
                
                ll[i] = false;
        }
    }
}
