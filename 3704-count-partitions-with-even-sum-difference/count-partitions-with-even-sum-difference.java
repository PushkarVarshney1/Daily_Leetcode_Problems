class Solution {
    public int countPartitions(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0 ;i<n-1 ; i++){
            int sum=0;
            for(int j=0 ; j<=i ;j++){
                sum=sum+arr[j];
            }
            int s2=0;
            for(int k=i+1 ; k<n ;k++){
                s2+=arr[k];
            }
            if((sum - s2) % 2 ==0) c++;
        }
        return c;
    }
}