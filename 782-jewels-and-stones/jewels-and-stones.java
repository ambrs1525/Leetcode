class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashMap<Character,Integer>map = new HashMap<>();
   

   for(int i = 0; i < jewels.length(); i++) {
            for(int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i) == stones.charAt(j)) {
                    map.put(stones.charAt(j),
                        map.getOrDefault(stones.charAt(j), 0) + 1);
                }
            }
        }
     int sum =0;
     for(Integer n:map.values()){
        sum+=n;
     }
     return sum;

    }
}