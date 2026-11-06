class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> ht = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String origStr = strs[i];
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String str = new String(strArr);

            if(!ht.containsKey(str)){
                ht.put(str,new ArrayList<>());
            }
            if(ht.containsKey(str)){
                ht.get(str).add(origStr);
            }

        }
        return new ArrayList<>(ht.values());
    }
}
