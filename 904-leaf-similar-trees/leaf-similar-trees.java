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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> ll1 = new ArrayList<Integer>();
        List<Integer> ll2 = new ArrayList<Integer>();
        fun(root1 , ll1);
        fun(root2 , ll2);
        if(ll1.equals(ll2))return true;
        return false;
    }
    public void fun(TreeNode root,List<Integer>ll1){
        if(root == null)return;
        if(root.left == null && root.right == null)
        {
            ll1.add(root.val);
            return ;
        }
        fun(root.left , ll1);
        fun(root.right , ll1);
    }
}