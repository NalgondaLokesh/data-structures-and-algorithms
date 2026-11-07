class Solution {
    public int longestConsecutive(int[] nums) {
        int seq = 1;
        int maxSeq = 1;
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
                maxSeq = Math.max(seq,maxSeq);
            }
            else{
                seq = 1;
            }
        }
        return maxSeq;
    }
}
