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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> ll1=new ArrayList<>();
        List<Integer> ll2=new ArrayList<>();
        fun(root1,ll1);
        fun(root2,ll2);
        for(int v:ll1){
            ans.add(v);
        }
        for(int v:ll2){
            ans.add(v);
        }
        Collections.sort(ans);
        return ans;

    }
    public void fun(TreeNode root,List<Integer>ll){
        if(root == null)return;
        fun(root.left,ll);
        ll.add(root.val);
        fun(root.right,ll);
    }
}