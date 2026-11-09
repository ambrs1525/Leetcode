class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>set = new HashSet<>();
        char dublicate=' ';
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
               dublicate = ch;
               break;
            }
        }
        return dublicate;
    }
}