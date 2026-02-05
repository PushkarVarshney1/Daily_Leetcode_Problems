class Solution {
    public List<String> findWords(char[][] maze, String[] words) {
        ll = new ArrayList<>();
        Trie t = new Trie();
        for(String s : words) {
            t.insert(s);
        }

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(t.root.child.containsKey(maze[i][j])) {
                    t.Search(maze, i, j, t.root);
                }
            }
        }
        return ll;
    }
    static List<String> ll;

    static class Trie {

        class Node {
            char ch;
            String isTerminal;
            HashMap<Character, Node> child = new HashMap<>();

            Node(char ch) {
                this.ch = ch;
            }
        }

        Node root = new Node('*');

        public void insert(String word) {
        	Node curr = root;
			for(int i=0; i<word.length(); i++) {
				char ch = word.charAt(i);
				if(curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				}
				else {
					Node nn = new Node(ch);
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isTerminal= word;

        }

        private void Search(char [][]maze , int i, int j, Node node) {
            if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || maze[i][j]=='*')
                return;

            char ch = maze[i][j];

            node = node.child.get(ch);
            if(node == null) return;
            if(node.isTerminal != null) {
                ll.add(node.isTerminal);
                node.isTerminal = null;
            }

            maze[i][j] = '*';
            Search(maze, i+1 , j, node);
            Search(maze, i-1 , j, node);
            Search(maze, i , j+1, node);
            Search(maze, i , j-1, node);
            maze[i][j] = ch;
        }
    }
}