/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(! q.isEmpty()){
            List<Integer>ll=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                ll.add(curr.val);
                if(curr.left != null) {
				    q.add(curr.left);
			    }
			    if(curr.right != null) {
				    q.add(curr.right);
			    }
            }
            ans.add(ll);    
        }
        Collections.reverse(ans); // the Main part
        return ans;
    }
}