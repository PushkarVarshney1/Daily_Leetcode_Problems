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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        //Post Order Traversal
        if(root == null)return null;

        root.left = removeLeafNodes(root.left, target); // left
        root.right = removeLeafNodes(root.right, target); // right
        if(root.left == null && root.right == null && root.val == target)return null; // root

        return root;
    }
}