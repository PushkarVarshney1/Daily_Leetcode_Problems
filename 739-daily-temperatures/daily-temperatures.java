class Solution {
    public int[] dailyTemperatures(int[] arr) {
		Stack<Integer> st=new Stack<>();
        // stack holds the indices in increasing order(monotonic way) untill the warmer day comes.
		int[]ans=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                ans[st.peek()] = i - st.peek();
				st.pop();
			}
			st.push(i);
		}
		return ans;
    }
}