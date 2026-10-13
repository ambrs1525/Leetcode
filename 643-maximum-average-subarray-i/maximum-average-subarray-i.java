class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg =0;
        double maxavg = 0;
        int sum =0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
            
        }
        avg = (double)sum/k;
        maxavg = avg;
        for(int i =k;i<nums.length;i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = (double)sum/k;
            maxavg = Math.max(maxavg,avg);
        }
        return maxavg;

        
    }
}