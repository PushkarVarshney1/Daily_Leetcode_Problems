class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(! set.contains(arr[i]-1)){
                int c=0;
                int key=arr[i];
                while(set.contains(key)){
                    set.remove(key);
                    c++;
                    key++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}