class Solution {
    public int findJudge(int n, int[][] trust) {
        int row=trust.length;
        // for checking you are trusting someone or not
        int [][]arr=new int[n][n];
        for(int i=0; i<row ;i++){
            arr[trust[i][0]-1][trust[i][1]-1]=1;
        }
        
        Stack<Integer> st =new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1)st.push(b);
            else st.push(a);
        }
        int ans=st.pop(); // remaining element may be the answer 
        // so check in the ans's row there is an one(1) means he trust someone , hence he is not judge
        for(int i=0;i<n;i++){
            if(arr[ans][i]==1) return -1;
        }
        // so check in the ans's col there is an one(0) means someone is not trust on him , hence he is not judge
        for (int i = 0; i < n; i++) {
            if (i == ans) {
                continue; // A person doesn't count for trusting themselves.
            }
            if (arr[i][ans] == 0) {
                return -1; 
            }
        }
        return ans+1; // remaining ele is the answer
    }
}