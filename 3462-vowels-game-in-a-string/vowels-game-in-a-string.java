class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if( isVowel( s.charAt(i )) ){
                c++;
            }
        }
        if(c == 0)return false;
        return true;
    }
    public boolean isVowel(char ch){
        return ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||
                ch =='I'||ch =='O'||ch =='U';
    }
}