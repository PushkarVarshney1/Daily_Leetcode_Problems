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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ll =new ArrayList<>();
        inorder(root,ll);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < ll.size(); i++) {
            minDiff = Math.min(minDiff, ll.get(i) - ll.get(i - 1));
        }
        return minDiff;
    }

    // Using Inorde traversal
    
    private void inorder(TreeNode root, List<Integer> values) {
        if (root == null) return;
        inorder(root.left, values);
        values.add(root.val);
        inorder(root.right, values);
    }
}