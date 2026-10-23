class Solution {
    public String clearDigits(String s) {
        Stack<Character>st = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch)){
                st.push(ch);
            }
            else{
               st.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i =0;i<st.size();i++){
            ans.append(st.get(i));
        }
        return ans.toString();
    }
}