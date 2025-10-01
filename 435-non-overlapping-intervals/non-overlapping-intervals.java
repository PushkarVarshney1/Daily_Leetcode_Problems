class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Same intution as min arrow to burst ballons
        int n=intervals.length;
        if(n==1)return 0;
        // Sorting by last element
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int ans=0;
        int Edpoint=intervals[0][1];
        for(int i=1; i<n; i++){
            int st=intervals[i][0];
            int ed=intervals[i][1];
            if(st < Edpoint){
                ans++;
            }
            else{
                Edpoint=ed;
            }
        }
        return ans;
    }
}