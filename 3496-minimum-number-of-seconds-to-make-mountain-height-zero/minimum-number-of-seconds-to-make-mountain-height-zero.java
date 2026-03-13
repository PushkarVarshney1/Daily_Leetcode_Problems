class Solution {
    public long minNumberOfSeconds(int hei, int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int x : arr) min = Math.min(min, x); 

        long lo = 0;
        long hi = (long)min * hei * (hei + 1) / 2;
// just using the quadraic formula => w(1+2+...+k)=[w.k(k+1)]/2 ≤ T  => k^2 + k <= 2 T/w
// => k=[−1+(1+8T/w)^-1/2]/2
        while(lo <= hi){
            long mid = lo + (hi - lo) / 2;
            long total = 0;
            for(int w : arr){
                long x = (2 * mid) / w;
                long k = (long)((Math.sqrt(1 + 4 * x) - 1) / 2);
                total += k;
                if(total >= hei) break;
            }
            if(total >= hei) hi = mid - 1;
            else lo = mid + 1;
        }
        return lo;
    }
}