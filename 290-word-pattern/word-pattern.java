class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(word)) {
                if (map.get(word) != c) {
                    return false;
                }
            } else {
                if (map.containsValue(c)) {
                    return false;
                }
                map.put(word, c);
            }
        }
        return true;
    }
}
