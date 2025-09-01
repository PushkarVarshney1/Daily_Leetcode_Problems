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
    int ans=0;
    int maxd=0;
    public int deepestLeavesSum(TreeNode root) {
        fun(root,1);
        return ans;
    }
    public void fun(TreeNode root,int lev){
        if(root == null)return;
        
        fun(root.right,lev+1);
        fun(root.left,lev+1);
        
        if(maxd == lev){
            ans+=root.val;
            return;
        }
        if(maxd<lev){
            maxd=lev;
            ans=root.val;
        }
    }
}