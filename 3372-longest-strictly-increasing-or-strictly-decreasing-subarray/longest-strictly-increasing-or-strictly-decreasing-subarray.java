class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i =0,k=0,ans=1;
        for(int j=0;j<nums.length;j++){
            while(i<j&&nums[j-1]>=nums[j]){
                i++;
            }
            while(k<j&&nums[j-1]<=nums[j]){
                k++;
            }
            ans= Math.max(ans,j-i+1);
            ans = Math.max(ans,j-k+1);

        }
        return ans;

    }
}