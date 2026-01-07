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
    long totalSum = 0;
    long ans = 0;
    static final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = sum(root);
        dfs(root);                 
        return (int)(ans % MOD);   
    }

    long sum(TreeNode root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    long dfs(TreeNode root) {
        if (root == null) return 0;

        long left = dfs(root.left);
        long right = dfs(root.right);
        long curr = root.val + left + right; // current SubTree Sum
        ans = Math.max(ans, curr * (totalSum - curr));

        return curr;   
    }
}
