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
    public boolean isUnivalTree(TreeNode root) {
        int x = root.val;
        //if(root.left.val != x || root.right.val != x)return false;
        return fun(root,x);
    }
    boolean fun(TreeNode root,int x){
        if(root == null){
            return true;
        }
        if(root.val != x)return false;
        boolean left = fun(root.left,x);
        boolean right = fun(root.right,x);
        return left && right;
    }
}