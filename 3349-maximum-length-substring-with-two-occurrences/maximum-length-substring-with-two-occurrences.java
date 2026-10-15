class Solution {
    public int maximumLengthSubstring(String s) {
        int i =0;
        int j = 0;
        int maxlen =0;
        HashMap<Character,Integer>map = new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.get(s.charAt(j))>2){
               map.put(s.charAt(i),map.get(s.charAt(i))-1);
                
               
               i++;
            }
            maxlen = Math.max(maxlen,j-i+1);
            j++;

        }
        return maxlen;
    }
}