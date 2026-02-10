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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lev = 0;
        while(!q.isEmpty()){
            int size = q.size();
            int x = -1; // even level
            int y = Integer.MAX_VALUE; // odd level
            for(int i=0; i<size; i++){
                TreeNode r = q.poll();
                if(lev % 2 == 0){
                    if(r.val % 2 == 0 || x >= r.val)return false;
                    x = r.val;
                }
                if(lev % 2 != 0){
                    if(r.val % 2 != 0 || y <= r.val )return false;
                    y = r.val;
                }
                if(r.left != null){
                    q.add(r.left);
                }
                if(r.right != null){
                    q.add(r.right);
                }
            }
            lev++;
        }
        return true;
    }
}