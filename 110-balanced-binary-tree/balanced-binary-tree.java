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
	public boolean isBalanced(TreeNode root) {
	    if(root == null){
            return true; // why ??
        }
        int x=height(root.left) - height(root.right);
        // if(Math.abs(x) <=1) return true; // this gives wrong why ??
        if(Math.abs(x) > 1) return false;
        boolean lft=isBalanced(root.left);
        boolean rgt=isBalanced(root.right);
	    return lft && rgt;
	}
    public int  height(TreeNode nn){
        if(nn == null) {
			return -1;
		}
		int lh=height(nn.left);
		int rh=height(nn.right);
		return Math.max(lh,rh)+1;
    }
}
	