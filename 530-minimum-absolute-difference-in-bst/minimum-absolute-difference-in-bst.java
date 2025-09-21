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
        fun(root,ll);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < ll.size(); i++) {
            System.out.println(ll.get(i));
            minDiff = Math.min(minDiff , ll.get(i) - ll.get(i - 1));
        }
        return minDiff;
    }

    // InOrder == BST

    public void fun(TreeNode root , List<Integer> ll){
        if(root == null){
            return ;
        }
        fun(root.left , ll);
        ll.add(root.val);
        fun(root.right , ll);
    }
}