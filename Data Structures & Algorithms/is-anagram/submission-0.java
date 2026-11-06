class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq1 = new HashMap<>();
        HashMap<Character,Integer> freq2 = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(freq1.containsKey(ch)){
                freq1.put(ch,freq1.get(ch)+1);
            }
            else{
                freq1.put(ch,1);
            }
        }
        for(char ch:t.toCharArray()){
            if(freq2.containsKey(ch)){
                freq2.put(ch,freq2.get(ch)+1);
            }
            else{
                freq2.put(ch,1);
            }
        }
        return freq1.equals(freq2);
    }
}
