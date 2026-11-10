class Solution {
    public int xorOperation(int n, int start) {
        int[] ans = new int[n];
        for(int i =0;i<ans.length;i++){
            ans[i] = start+2*i;
        }
        int xor = 0;
        for(int i =0;i<ans.length;i++){
            xor ^=ans[i];
        }
        return xor;
    }
}