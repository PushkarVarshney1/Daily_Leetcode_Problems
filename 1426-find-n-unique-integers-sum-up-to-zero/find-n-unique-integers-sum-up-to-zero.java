class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer>ll=new ArrayList<>();
        if(n%2!=0)ll.add(0);
        for (int i=1;i<n/2+1;i++){
            ll.add(i);
            ll.add(-i);
        }
        System.out.print(ll);
        int[] arr = new int[ll.size()];
        for (int i = 0; i < ll.size(); i++) {
            arr[i] = ll.get(i);  
        }
        return arr;
    }
}