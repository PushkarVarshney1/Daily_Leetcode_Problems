class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map1=new HashMap<>();
        HashMap<Integer , Integer> map2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int v=nums1[i];
            if(map1.get(v) != null && map2.get(v) != null){
                if(map1.get(v) != 0 && map2.get(v) != 0){
                ll.add(v);
                map1.put(v,map1.get(v)-1);
                map2.put(v,map2.get(v)-1);
                }
            }
        }
        int []arr = new int[ll.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}