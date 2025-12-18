class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<c;i++){
            int x=0;
            int y = i;
            int temp = mat[x][y];
            while(x<r && y<c){
                if(temp != mat[x][y])return false;
                x++;
                y++;
            }
        }
        for(int i=1;i<r;i++){
            int y = 0;
            int x = i;
            int temp = mat[x][y];
            while(x<r && y<c){
                if(temp != mat[x][y])return false;
                x++;
                y++;
            }
        }
        return true;
    }
}