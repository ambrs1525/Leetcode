class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum =0;
         boolean isodd = false;
        for(Integer n:map.values()){
           
            if(n%2!=0){
               isodd = true;
               sum +=n-1;
            }
            else{
                sum+=n;
            }
        }
        if(isodd){
            return sum+1;
        }
        return sum;
    }
}