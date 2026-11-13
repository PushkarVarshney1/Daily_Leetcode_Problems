class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(char c : word.toCharArray()){
            sb.append(c);
            if(c == ch && k == 0){
                sb.reverse();
                k++;
            }
        }
        return sb.toString();
    }
}