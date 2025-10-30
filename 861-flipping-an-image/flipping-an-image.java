class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){

            // flip an image --> reverse elements of each row
            flip(n,i,arr);

            // invert an image
            for(int j=0;j<n;j++){
                arr[i][j] = (arr[i][j]==1) ? 0 : 1;
            }
            
        }
        return arr;
    }   
    public void flip(int n,int i,int[][]arr){
        int st=0;
        int ed=n-1;
        while(st < ed){
            int temp=arr[i][st];
            arr[i][st]=arr[i][ed];
            arr[i][ed]=temp;
            st++;
            ed--;
        }
    }
}