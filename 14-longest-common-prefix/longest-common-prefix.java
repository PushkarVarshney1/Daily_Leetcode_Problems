class Solution {
    public String longestCommonPrefix(String[] v) {
        // Using Trie
        Trie t = new Trie();
        for(int i=0; i<v.length; i++){
            t.insert(v[i]);
        }
        return t.search(v[0]);
    }
    class Trie{
        class Node{
            Character ch;
            boolean isterminal;
            HashMap<Character, Node> map = new HashMap<>();
            Node(char ch){
                this.ch = ch;
            }
        }
        Node root= new Node('*');
        public void insert(String word){
            Node curr = root;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(curr.map.containsKey(ch)){
                    curr = curr.map.get(ch);
                }
                else{
                    Node nn=new Node(ch);
                    curr.map.put(ch, nn);
                    curr = nn;
                }
            }
            curr.isterminal = true;
        }
        public String search(String word){
            Node curr = root;
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(curr.map.size() != 1 || curr.isterminal){
                    break;
                }
                sb.append(ch);
                curr=curr.map.get(ch);
            }
            return sb.toString();
        }
    }
}