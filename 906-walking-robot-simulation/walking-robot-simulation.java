class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int dirX = 0, dirY = 1;
        int x = 0, y = 0;
        long ans = 0;
        Set<String> set = new HashSet<>();
        for(int []a : obstacles){
            set.add(a[0] + "," + a[1]);
        }
        for(int i : commands){
            if(i == -1){
                // turn right
                int temp = dirX;
                dirX = dirY;
                dirY = -temp;
            }
            else if(i == -2){
                // turn left
                int temp = dirY;
                dirY = dirX;
                dirX = -temp;
            }
            else{
                for(int j = 1; j<=i; j++){
                    int nx = x + dirX;
                    int ny = y + dirY;
                    if(set.contains(nx + "," + ny))break;
                    x = nx; y = ny;
                    ans = Math.max(ans, (x*x + y*y));
                }
            }
        }
        return (int)ans;
    }
}