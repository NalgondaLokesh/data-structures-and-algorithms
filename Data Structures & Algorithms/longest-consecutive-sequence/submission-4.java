class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int maxSeq = 1;
        int currentSeq = 1;
        
        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] == nums[i - 1] + 1) {
                currentSeq++;
                maxSeq = Math.max(maxSeq, currentSeq);

            } else {
                currentSeq = 1; // Reset streak
            }
        }
        
        return maxSeq;
    }
}