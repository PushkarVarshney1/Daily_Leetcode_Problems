class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            // flip an image --> reverse elements of each row
            int st=0;
            int ed=n-1;
            while(st < ed){
                int temp=arr[i][st];
                arr[i][st]=arr[i][ed];
                arr[i][ed]=temp;
                st++;
                ed--;
            }
            // invert an image
            for(int j=0;j<n;j++){
                if(arr[i][j] == 0)arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
        return arr;
    }   
}