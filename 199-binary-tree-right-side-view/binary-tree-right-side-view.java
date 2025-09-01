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
     int maxd=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        fun(root,1,ll);
        return ll;
    }
    public void fun(TreeNode root,int currlev,List<Integer>ll){
        if(root == null)return;
        if(maxd < currlev){
            ll.add(root.val);
            maxd=currlev;
        }
        fun(root.right,currlev+1,ll);
        fun(root.left,currlev+1,ll);
    }
}