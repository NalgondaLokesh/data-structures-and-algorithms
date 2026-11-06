class Solution {
    public int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        for(int num:nums){
            minimum = Math.min(num,minimum);
        }
        return minimum;
    }
}
