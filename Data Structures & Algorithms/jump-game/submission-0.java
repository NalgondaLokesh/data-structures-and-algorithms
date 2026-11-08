class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
		int currentIndex = 0;
		while(currentIndex<nums.length && nums[currentIndex]>0){
		    currentIndex += nums[currentIndex];
		}
		return n==currentIndex;
    }
}
