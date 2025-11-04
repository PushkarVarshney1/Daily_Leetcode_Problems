class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length == 0)return 0;
        Arrays.sort(arr);
        int c=1;
        int ans=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            }
            if(arr[i]+1 == arr[i+1]){
                c++;
            }
            else{
                c=1;
            }
            ans = Math.max(c,ans);
        }
        return ans;
    }
}