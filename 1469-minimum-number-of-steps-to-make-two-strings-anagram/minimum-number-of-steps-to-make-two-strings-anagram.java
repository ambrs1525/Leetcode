class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>map1 = new HashMap<>();
     //  HashMap<Character,Integer>map2 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
         for(int i =0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
        }
        int count =0;
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(value>0){
                count +=value;
            }
        }
        return count;


    }
}