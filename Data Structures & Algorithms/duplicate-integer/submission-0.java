class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean presentDup = false;
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
            if(freq.get(key)>1){
                return true;
            }
        }
        return false;
    }
}