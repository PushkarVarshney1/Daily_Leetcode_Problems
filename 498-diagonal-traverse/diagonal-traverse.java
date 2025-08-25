class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row=0,col=0;
        int m=mat.length , n=mat[0].length;
        int []arr=new int[m*n];
        int index=0;
        while(index<m*n){
            arr[index++]=mat[row][col];
            int sum=row+col;
            // going up diagonally
            if(sum%2==0){
                if(row>0 && col<n-1){
                    row--;
                    col++;
                }
                else if(col<n-1) col++;
                else row++;
            }
            //going down diagonally
            else{
                if(row<m-1 && col>0){
                    col--;
                    row++;
                }
                else if(row<m-1) row++;
                else col++;
            }
        }
        return arr;
    }
}