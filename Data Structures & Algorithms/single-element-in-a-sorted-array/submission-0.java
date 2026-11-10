class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }
            else{
                freq.put(num,1);
            }
        }
        for(int key:freq.keySet()){
            if(freq.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}