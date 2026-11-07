class Solution {
    public int longestConsecutive(int[] nums) {
        int seq = 0;
        int maxSeq = 0;
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num:nums){
            if(!arr.contains(num)){
                arr.add(num);
            }
        }
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)==arr.get(i)-1){
                seq++;
                maxSeq = Math.max(seq,maxSeq)+1;
            }
            else{
                seq = 1;
            }
        }
        return maxSeq;
    }
}
