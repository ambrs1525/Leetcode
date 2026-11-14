class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       HashSet<Integer>set = new HashSet<>();
       for(Integer n:map.values()){
          set.add(n);
       }
       if(set.size()==1){
        return true;
       }
       return false;

    }
}