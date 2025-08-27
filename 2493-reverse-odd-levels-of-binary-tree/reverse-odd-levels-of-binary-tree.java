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
    public TreeNode reverseOddLevels(TreeNode root) {
        // if(root == null)return null;
        // int level=0;
        // if(level % 2 == 0){
        //     TreeNode temp=root.left;
        //     root.left=root.right;
        //     root.right=temp;
            
        // }
        // level++;
        // reverseOddLevels(root.left);
        // reverseOddLevels(root.right);
        // return root; 
        dfs(root.left,root.right,0);
        return root;
    }
    public void dfs(TreeNode root1, TreeNode root2, int lev){
        if(root1 == null && root2 == null)return;
        if(lev % 2 == 0){
             int temp=root1.val;
             root1.val=root2.val;
             root2.val=temp;
        }
        dfs(root1.left,root2.right,lev+1);
        dfs(root1.right,root2.left,lev+1);

    }
}