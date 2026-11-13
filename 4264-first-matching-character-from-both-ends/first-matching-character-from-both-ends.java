class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int i =0;
        int j = n-i-1;
        while(i<=j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if(ch==ch1){
                return i;
                
            }
            else{
                i++;
                j--;
            }

        }
        return -1;
    }
}