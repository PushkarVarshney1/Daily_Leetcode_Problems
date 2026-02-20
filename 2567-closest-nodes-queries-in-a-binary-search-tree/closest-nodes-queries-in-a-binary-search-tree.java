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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> BSTOrder = new ArrayList<>();
        inOrd(BSTOrder, root);

        for(int v : queries){
            int floor = Floor(BSTOrder, v);
            int ceil = Ceil(BSTOrder, v);
            
            ans.add(Arrays.asList(floor, ceil));
        }
        return ans;
    }
    void inOrd(List<Integer> ll, TreeNode root){
        if(root == null){
            return;
        }
        inOrd(ll, root.left);
        ll.add(root.val);
        inOrd(ll,root.right);
    }
    int Floor(List<Integer>ll, int tar){
        int ans = -1;
        int lo = 0;
        int hi = ll.size()-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int ele = ll.get(mid);
            if(ele <= tar){
                ans = ele;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }
    int Ceil(List<Integer>ll, int tar){
        int ans = -1;
        int lo = 0;
        int hi = ll.size()-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int ele = ll.get(mid);
            if(ele >= tar){
                ans = ele;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
