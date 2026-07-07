class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> ll = new ArrayList<>(map.keySet());
        Collections.sort(ll, (a,b)->map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch : ll){
            int x = map.get(ch);
            while(x-- > 0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}