class Solution {
    public int closestTarget(String[] words, String target, int stIdx) {
        int f = 0;
        int count = 0;
        for(String s : words){
            if(s.equals(target)){
                f = 1;
                count++;
            }
        }
        if(f == 0)return -1;
        int n = words.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<=count/2; i++){
            // right
            int c = 0;
            int j = stIdx;
            while(words[(j + n)% n].compareTo(target) != 0){
                c++;
                j++;
            }
            ans = Math.min(ans, c);

            // left
            c = 0;
            j = stIdx;
            while(words[(j + n) % n].compareTo(target) != 0){
                c++;
                j--;
            }
            ans = Math.min(ans, c);
            c = 0;
        }
        return ans;
    }
}