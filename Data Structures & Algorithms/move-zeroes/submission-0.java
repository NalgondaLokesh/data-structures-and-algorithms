class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[left] = nums[i];
                left++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = ans[i];
        }
    }
}