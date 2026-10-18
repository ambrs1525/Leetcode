class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int left=0,right=0,max=0;
       while(right<s.length()){
        map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        while(map.get(s.charAt(right))>1){
            char ch = s.charAt(left);
            map.put(ch,map.get(ch)-1);
            left++;
        }
          max = Math.max(max, right - left + 1);
        right++;

       }
       return max;
    }
}