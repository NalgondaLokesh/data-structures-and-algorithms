class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            if(st.isEmpty()){
                return false;
            }
            if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
