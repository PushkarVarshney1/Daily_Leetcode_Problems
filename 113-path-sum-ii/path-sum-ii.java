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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(root, targetSum, new ArrayList<>(),ans);
        return ans;
    }
    void fun(TreeNode root, int targ,List<Integer> ll,List<List<Integer>>ans){
        if(root == null)return;
        ll.add(root.val); // add before the leaf node 

        if(root.left == null && root.right == null){
            if(targ-root.val == 0){
                ans.add(new ArrayList<>(ll));
            }
        }
        fun(root.left, targ-root.val, ll, ans);
        fun(root.right, targ-root.val, ll, ans);
        
        ll.remove(ll.size()-1);
    }
}