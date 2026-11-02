class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       int median =0;
       
        median =n/2;
       
      int value = nums[median];
       int count =0;
       for(int i =0;i<n;i++){
           count +=Math.abs(value-nums[i]);
       }
       return count;

    }
}