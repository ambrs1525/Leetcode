class Solution {
    public int calculateScore(int a, int b) {
        String s1 = Integer.toBinaryString(a);
        String s2 = Integer.toBinaryString(b);
        int count_s1 =0;
        int count_s2=0;
      //  int score =0;
        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch=='1'){
                count_s1++;
            }
        }
        for(int i =0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(ch=='1'){
                count_s2++;
            }
        }
        if(count_s1>=count_s2){
            return count_s1*count_s2;
            
        }
        return count_s2/count_s1;
        
        
    }
}