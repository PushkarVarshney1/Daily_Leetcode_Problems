class Solution {
    public String getHint(String secret, String guess) {
        int[] freq = new int[10];
        int bull = 0;
        int cow = 0;
        for(int i=0; i<secret.length(); i++){
            int a = secret.charAt(i) - '0';
            int b = guess.charAt(i) - '0';
            if(a == b){
                bull++;
            }
            else{
                if(freq[a] < 0)cow++;
                if(freq[b] > 0)cow++;
                freq[a]++;
                freq[b]--;
            }
        }
        return bull + "A" + cow + "B";
    }
}