class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>mp1 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
        }
        int count =0;
        HashSet<Integer>set = new HashSet<>();
        for(Integer val:mp1.values()){
            while(val>0&& set.contains(val)){
                val--;
                count++;
            }
            if(val>0){
                set.add(val);
            }
        }
       return count;


    }
}