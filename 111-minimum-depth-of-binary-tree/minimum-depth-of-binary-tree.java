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
    public int minDepth(TreeNode root) {
        if(root == null)return 0; 
        return MinDepth(root);
    }
    public int MinDepth(TreeNode root) {
        if(root == null)return Integer.MAX_VALUE; // because if we return 0 it is always min when left == null
        if(root.left == null && root.right == null)return 1;
        int left=MinDepth(root.left);
        int right=MinDepth(root.right);
        return Math.min(left,right)+1;
    }
}