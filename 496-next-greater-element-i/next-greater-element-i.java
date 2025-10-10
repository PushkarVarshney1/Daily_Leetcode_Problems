class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int n:nums2){
            while(!st.isEmpty() && n>st.peek()){
                map.put(st.pop(),n);
            }
            st.push(n);
        }
        int i=0;
        for(int n:nums1){
            nums1[i]=map.getOrDefault(n,-1);
            i++;
        }
        return nums1;
    }
}