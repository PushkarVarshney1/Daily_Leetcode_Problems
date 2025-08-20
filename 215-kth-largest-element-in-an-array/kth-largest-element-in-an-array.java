class Solution {
    public int findKthLargest(int[] arr, int k) {
        int []freq=new int[20001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+10000]++;
        }
        for(int i=freq.length-1 ; i>=0  ; i--){
            if(freq[i]>0){
                k-=freq[i];
                if(k<=0){
                    return i-10000;
                }
            }
        }
        return 0;
    }
}