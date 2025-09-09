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
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null)return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        fun(root,map);

        int maxVal = Collections.max(map.values());
        List<Integer> ll = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == maxVal) {
                ll.add(e.getKey());
            }
        }

        // Convert to array
        int[] ans = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            ans[i] =ll.get(i);
        }

        return ans;
    }
    public int fun(TreeNode root,HashMap<Integer,Integer>map){
        if(root == null)return 0;
        int l=fun(root.left,map);
        int r=fun(root.right,map);
        int s=root.val+l+r;
        map.put(s, map.getOrDefault(s, 0) + 1);
        return s;
    }
}