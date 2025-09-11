class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                pq.add(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch))
                ans.append(pq.poll());
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public boolean isVowel(char ch){
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||
                ch =='I'||ch =='O'||ch =='U') return true;
        return false;
    }
}