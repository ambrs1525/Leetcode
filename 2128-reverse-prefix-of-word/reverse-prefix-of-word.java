class Solution {
    public String reversePrefix(String word, char ch) {
     
            

          boolean found = false;
        Stack<Character>s = new Stack<>();
        int i =0;
        int n = word.length();
        while(i<n){
            if(word.charAt(i)!=ch){
            s.push(word.charAt(i));
            i++;
            }
            else{
                found= true;
                s.push(ch);
                i++;
                break;
            }
        }
        if(found==false){
            return word;
        }
        StringBuilder ans = new StringBuilder();
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        while(i<n){
            ans.append(word.charAt(i));
            i++;
        }
        return ans.toString();
    }
}