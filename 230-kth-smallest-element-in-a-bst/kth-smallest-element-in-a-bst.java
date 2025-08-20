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
    private List<Integer> ll = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        fun(root);
        return ll.get(k-1);
    }
    public void fun(TreeNode root){
        if(root == null)return;
        fun(root.left);
        ll.add(root.val);
        fun(root.right);
    }
}