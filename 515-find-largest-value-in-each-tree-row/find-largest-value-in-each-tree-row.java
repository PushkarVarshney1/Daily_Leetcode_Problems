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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ll = new ArrayList<>();
        if (root == null) return ll; // if root=[]
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int x=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode currNode=q.poll();
                x=Math.max(x,currNode.val);
                if(currNode.left != null)q.add(currNode.left);
                if(currNode.right != null)q.add(currNode.right);
            }
            ll.add(x);
        }
        return ll;
    }
}