class Solution {
    public int findNumbers(int[] nums) {
        int i =0;
       // int digit =0;
       
        int count_even=0;
        while(i<nums.length){
            int temp = nums[i];
             int count =0;
            while(temp!=0){
              temp = temp/10;
               count++;
            }
            if(count%2==0){
                count_even++;
            }
            i++;
        }
        return count_even;

    }
}