class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int v=0 , c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(isVowel(ch)){
                v=Math.max(map.get(ch) , v);
            }
            else{
                c=Math.max(map.get(ch) , c);
            }
        }
        return c+v;
    }

    public boolean isVowel(char ch){
        return ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||
                ch =='I'||ch =='O'||ch =='U';
    }
}