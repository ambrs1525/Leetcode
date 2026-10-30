class Solution {
    public int countConsistentStrings(String allowed, String[] words)  {
        int count =0;
       HashSet<Character>set = new HashSet<>();
       for(int i =0;i<allowed.length();i++){
          set.add(allowed.charAt(i));
       }
      
       for(int i =0;i<words.length;i++){
         int flag =1;
        for(int j =0;j<words[i].length();j++){
            if(!set.contains(words[i].charAt(j))){
                flag =0;
                break;
            }

      
       }
         if(flag==1){
            count++;
        }
       }
       
       return count;

    }
}