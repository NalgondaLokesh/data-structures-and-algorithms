class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        boolean hasZero = false;
        for(int num:nums){
            if(num!=0){
                prod = prod*num;
            }
            if(num==0){
                hasZero = true;
            }
        }
        if(hasZero){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    ans[i] = 0;
                }
                else{
                    ans[i] = prod;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  
