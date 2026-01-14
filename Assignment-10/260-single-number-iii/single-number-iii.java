class Solution {
    public int[] singleNumber(int[] nums) {
		int xor = XOR(nums);
		// mask var includes the element upto first 1 in XOR of arr
		int mask = xor & (~(xor-1));
		
		// a =  Xor of grp1 elements 
		int a = 0;
		for(int i=0; i<nums.length; i++) {
			if((mask & nums[i]) != 0) {
				a = a ^ nums[i];
			}
		}
		// b =  Xor of grp2 elements 
		int b = xor ^ a;
		
		return new int[] {a , b};
		
	}
	public static int XOR(int[]arr) {
		int xor = 0;
		for(int a : arr) xor ^= a;
		return xor;
	}

}