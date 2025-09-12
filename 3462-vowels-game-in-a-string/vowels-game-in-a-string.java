class Solution {
    public boolean doesAliceWin(String s) {

        // iF vowel is present Always Alice wins otherwise Bob
        for(int i=0;i<s.length();i++){
            if( isVowel( s.charAt(i )) ){
                return true;
            }
        }
        return false;
    }
    public boolean isVowel(char ch){
        return ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||
                ch =='I'||ch =='O'||ch =='U';
    }
}