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
    int maxd=0;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth(root,1);
        return fun(root,1);
    }
    public TreeNode fun(TreeNode root,int lev){
        if(root == null)return null;
        if(lev == maxd){
            return root;
        }
        TreeNode right=fun(root.right,lev+1);
        TreeNode left=fun(root.left,lev+1);
        if(right != null && left!=null){
            return root;
        }
        else if(left == null)return right;
        else return left;
    }
    public void depth(TreeNode root,int lev){
        if(root == null){
            return ;
        }
        maxd=Math.max(maxd,lev);
        depth(root.left,lev+1);
        depth(root.right,lev+1);
    }
}