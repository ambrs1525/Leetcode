class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st = new Stack<>();
        for(int i =0;i<s.length();i++){
             char ch = s.charAt(i);
             if(ch!='#'){
                st.push(ch);
             }
            else if (!st.isEmpty()) {
    st.pop();
}
        }
        Stack<Character>st1 = new Stack<>();
         for(int i =0;i<t.length();i++){
             char ch = t.charAt(i);
             if(ch!='#'){
                st1.push(ch);
             }
            else if (!st1.isEmpty()) {
    st1.pop();
}
        }
        return st.equals(st1);


    }
}