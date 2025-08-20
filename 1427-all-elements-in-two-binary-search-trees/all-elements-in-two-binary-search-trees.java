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
        fun1(root1,ll1);
        fun2(root2,ll2);
        for(int v:ll1){
            ans.add(v);
        }
        for(int v:ll2){
            ans.add(v);
        }
        Collections.sort(ans);
        return ans;

    }
    public void fun1(TreeNode root,List<Integer>ll1){
        if(root == null)return;
        fun1(root.left,ll1);
        ll1.add(root.val);
        fun1(root.right,ll1);
    }

    public void fun2(TreeNode root,List<Integer>ll2){
        if(root == null)return;
        fun2(root.left,ll2);
        ll2.add(root.val);
        fun2(root.right,ll2);
    }
}