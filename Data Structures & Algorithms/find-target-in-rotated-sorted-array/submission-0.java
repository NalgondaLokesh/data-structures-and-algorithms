class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
