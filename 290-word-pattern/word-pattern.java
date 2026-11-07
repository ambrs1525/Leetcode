class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        char[] word = pattern.toCharArray();

        if (word.length != words.length) {
            return false;
        }
        HashMap<Character, String>map = new HashMap<>();
         HashMap<String,Character>map2 = new HashMap<>();
        for(int i =0;i<word.length;i++){
           char ch = word[i];
            String str = words[i];
            if(map.containsKey(ch)&&!map.get(ch).equals(str)){
                return false;
            }
            if(map2.containsKey(str)&&map2.get(str)!=ch){
                return false;
            }
            map.put(ch,str);
            map2.put(str,ch);
        }
        return true;
 
    }
}