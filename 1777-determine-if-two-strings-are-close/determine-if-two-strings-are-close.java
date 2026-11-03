class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer>mp1 = new HashMap<>();
        for(int i =0;i<word1.length();i++){
            mp1.put(word1.charAt(i),mp1.getOrDefault(word1.charAt(i),0)+1);
        }

          HashMap<Character,Integer>mp2 = new HashMap<>();
        for(int i =0;i<word2.length();i++){
            mp2.put(word2.charAt(i),mp2.getOrDefault(word2.charAt(i),0)+1);
        }
        if (!mp1.keySet().equals(mp2.keySet())){
            return false;
        }
        List<Integer>l1 = new ArrayList<>(mp1.values());
        List<Integer>l2 = new ArrayList<>(mp2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);        


    }
}