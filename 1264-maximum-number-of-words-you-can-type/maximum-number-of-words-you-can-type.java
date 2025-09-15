class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<brokenLetters.length();i++){
            char ch=brokenLetters.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        
        String []arr=text.split(" ");
        int n=arr.length;
        int ans=0;
        for(int i=0 ; i<n ; i++){
            String s=arr[i];
            for(int j=0 ; j<s.length() ; j++){
                char ch=s.charAt(j);
                if(map.get(ch) != null){
                    ans-=1;
                    break;
                }
            }
            ans++;
        }
        return ans;
    }
}