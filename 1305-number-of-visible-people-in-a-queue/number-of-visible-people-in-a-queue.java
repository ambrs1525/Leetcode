class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        Stack<Integer>s = new Stack<>();
        for(int i = heights.length-1;i>=0;i--){
            int cnt =0;
            while(!s.empty()&&heights[i]>s.peek()){
                s.pop();
                cnt++;
            }
            if(!s.empty()){
                cnt++;
            }
            ans[i] = cnt;
            s.push(heights[i]);
        }
        return ans;
    }
}