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
    int getmax(int st ,int ed, int[]nums){
        int idx = 0;
        int max = -1;
        for(int i=st; i<=ed; i++){
            if(max < nums[i]){
                max = nums[i];
                idx = i;
            }
        }
        return idx;
    }
    TreeNode fun(int st , int ed, int[]nums){
        if(st > ed)return null;
        int maxIdx = getmax(st,ed,nums);

        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = fun(st, maxIdx-1, nums);
        root.right = fun(maxIdx+1, ed, nums);

        return root;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return fun(0,nums.length-1, nums);
    }
}