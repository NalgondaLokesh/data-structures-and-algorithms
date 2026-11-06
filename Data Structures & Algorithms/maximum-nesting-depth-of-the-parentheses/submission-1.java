class Solution {
    public int maxDepth(String s) {
        int maxDepth = -1;
        int depth = 0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
            }
            else if(ch==')' && depth>0){
                maxDepth = Math.max(maxDepth,depth);
                depth--;
            }
        }   
        return maxDepth;
    }
}