class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int prev =0;
       
        long sum =0;
       
        
        for(int i =0;i<nums.length&& k>0;i++){
             if (nums[i] <= prev) {
              continue;
         }
          int count = nums[i] - prev - 1;
    int take = Math.min(k, count);

    long first = prev + 1;
    long last = prev + take;

    sum += (take * (first + last)) / 2;

    k -= take;
    prev = nums[i];
        }
        if (k > 0) {
    long first = prev + 1;
    long last = prev + k;

    sum += (k * (first + last)) / 2;
}
        return sum;
    }
}