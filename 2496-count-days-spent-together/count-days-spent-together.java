class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[]day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String []aA = arriveAlice.split("-");
        String []lA = leaveAlice.split("-");
        String []aB = arriveBob.split("-");
        String []lB = leaveBob.split("-");
        int s1 = Integer.parseInt(aA[0]) * 100 + Integer.parseInt(aA[1]);
        int e1 = Integer.parseInt(lA[0]) * 100 + Integer.parseInt(lA[1]);
        int s2 = Integer.parseInt(aB[0]) * 100 + Integer.parseInt(aB[1]);
        int e2 = Integer.parseInt(lB[0]) * 100 + Integer.parseInt(lB[1]);

        int s = Math.max(s1, s2);
        int e = Math.min(e1, e2);

        if (s > e) return 0;
        int ans = 0;
        for (int i = s; i <= e; ) {
            ans++;
            int m = i / 100;
            int d = i % 100;
            if (d < day[m - 1]) i++;
            else i = (m + 1) * 100 + 1;
        }
        return ans;
    }
}