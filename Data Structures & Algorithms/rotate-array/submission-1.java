class Solution {
    public void rotate(int[] nums, int k) {
        k = nums.length%k;
        int left = 0;
        int right = k-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = k;
        right = nums.length-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = nums.length-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return;
    }
}