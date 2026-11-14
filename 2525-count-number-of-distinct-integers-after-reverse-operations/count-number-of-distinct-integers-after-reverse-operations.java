class Solution {
    public int reverse(int num){
         int temp = num;
         int digit =0;
         int sum =0;
         while(temp!=0){
            digit = temp%10;
            temp = temp/10;
            sum = sum*10+digit;
         }
         return sum;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);

        }
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int result =reverse(num);
            set.add(result);
        }
        return set.size();
    }
}