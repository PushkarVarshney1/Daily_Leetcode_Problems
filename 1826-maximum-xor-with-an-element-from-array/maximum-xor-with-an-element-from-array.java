class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        int [][] q = new int[queries.length][3];
		for(int i=0; i<q.length; i++) {
			q[i][0] = queries[i][0]; // xi
		    q[i][1] = queries[i][1]; // mi
			q[i][2] = i; // idx
		}
		Arrays.sort(nums);
		Arrays.sort(q,(a,b) -> a[1] - b[1]);
		Trie t = new Trie();
		int []ans = new int[q.length];
		int idx = 0;
		for(int []a : q) {
		    int xi = a[0];
			int mi = a[1];
			int i = a[2];
			while(idx < nums.length && nums[idx] <= mi){
			    t.add(nums[idx]);
			    idx++;
			}
			if(idx == 0)ans[i] = -1;
			else {
			    ans[i] = t.getMaxXOR(xi);
			}
		}
		return ans; 
	}
	static class Trie{
		class Node{
			Node one;
			Node zero;
		}
		private Node root = new Node();
		public void add(int val) {
        	Node curr = root;
        	for(int i=31; i>=0; i--) {
        		int bit = val & (1 << i);
        		if(bit == 0) {
        			if(curr.zero != null) {
        				curr = curr.zero;
        			}
        			else {
        				Node nn = new Node();
        				curr.zero = nn;
        				curr = nn;
        			}
        		}
        		else {
        			if(curr.one != null) {
        				curr = curr.one;
        			}
        			else {
        				Node nn = new Node();
        				curr.one = nn;
        				curr = nn;
        			}
        		}
        	}
        }
		public int getMaxXOR(int x) {
        	int ans = 0;
        	Node curr = root;
        	for(int i=31; i>=0; i--) {
        		int bit = x & (1<<i);
        		if(bit == 0) {
        			if(curr.one !=  null){
        				ans = ans | (1<<i);
        				curr = curr.one;
        			}
        			else {
        				curr = curr.zero;
        			}
        		}
        		else{
        			if(curr.zero != null){
        				ans = ans | (1<<i);
        				curr = curr.zero;
        			}
        			else {
        				curr = curr.one;
        			}
        		}
        	}
        	return ans;
        }
    }
}