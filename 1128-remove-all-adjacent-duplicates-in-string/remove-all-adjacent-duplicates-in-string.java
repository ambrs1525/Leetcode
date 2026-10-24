class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        // if(st.isempty()){
           //   st.push(s.charAt(0));
      //   }
         StringBuilder ans = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()&&ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        for(char i:st){
            ans.append(i);
        }
        return ans.toString();
    }
}