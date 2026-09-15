class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int v : temp){
            if(map.get(v) == null){
                map.put(v, rank++);
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}