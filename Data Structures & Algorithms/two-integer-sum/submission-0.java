class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[]{i,map.get(required)};
            }
        }
        return new int[]{-1,-1};
    }
}
