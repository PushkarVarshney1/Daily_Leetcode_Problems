class Solution {
    public int totalMoney(int n) {
        int c=0; // to incerase the count by 1 after a complete 8 rotation
        int ans=0;
        int x=1; // number always increasing 
        while(n != 0){
            if(x%8==0){
                c++;
                x++;
            }
            
            ans+= (x % 8) + c;
            x++;
            n--;
        }
        return ans;
    }
}