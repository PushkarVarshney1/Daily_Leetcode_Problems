class Solution {
    public int maxDistance(int[] A, int[] B) {
        int i=0, j=1;
        while (i < A.length && j < B.length) {
            if (A[i] > B[j]) i++;
            j++;
        }
        return j - i - 1;
    }
}