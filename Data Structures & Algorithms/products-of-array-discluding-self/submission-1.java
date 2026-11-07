class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] ans = new int[nums.length];
        int countZeros = 0;
        for(int num:nums){
            if(num!=0){
                prod = prod*num;
            }
            if(num==0){
                countZeros++;
            }
        }
        if(countZeros==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    ans[i] = 0;
                }
                else{
                    ans[i] = prod;
                }
            }
        }
        else if(countZeros==0){
            for(int i=0;i<nums.length;i++){
                ans[i] = prod/nums[i];
            }
        }
        else if(countZeros>1){
            for(int i=0;i<nums.length;i++){
                ans[i] = 0;
            }
        }
        return ans;
    }
}  
