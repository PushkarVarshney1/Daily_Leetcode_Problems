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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        fun(root,ll);
        return ll;
    }
    public void fun(TreeNode root,List<Integer>ll){
        if(root==null)return;
        fun(root.left,ll);
        ll.add(root.val);
        fun(root.right,ll);
    }
}