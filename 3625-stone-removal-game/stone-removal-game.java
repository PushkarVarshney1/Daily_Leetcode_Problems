class Solution {
    public boolean canAliceWin(int n) {
        int x = 10;
        boolean flag = true;
        while(n >= x){
            n -= x;
            flag = !flag;
            x--;
        }
        return flag == false;
    }
}