class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If our current position has gone past the maximum reach, we're stuck
            if (i > maxReach) {
                return false;
            }
            
            // Update the furthest we can reach from here
            maxReach = Math.max(maxReach, i + nums[i]);
            
            // If maxReach can touch or pass the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}