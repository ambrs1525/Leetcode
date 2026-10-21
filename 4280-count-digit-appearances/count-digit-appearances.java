class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int d =0;
        int count =0;
        int i =0;
        while(i<nums.length){
            int temp = nums[i];
            while(temp!=0){
                d = temp%10;
                if(d==digit){
                    count++;
                }
                temp = temp/10;
            }
            i++;
        }
        return count;
    }
}