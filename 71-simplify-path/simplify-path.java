class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String>st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            String ch = arr[i];
           
            if(ch.equals("") ||ch.equals(".")){
                continue;
            }
             else if (ch.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String i:st){
            ans.append("/");
            ans.append(i);
        }
        return ans.length() ==0?"/":ans.toString();
 
    }
}