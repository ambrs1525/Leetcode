class Solution {
    public int minElement(int[] nums) {
       int digit =0;
      
       int i =0;
       while(i<nums.length){
         int sum=0;
        int temp =nums[i];
         while(temp!=0){
            digit = temp%10;
            temp = temp/10;
            sum +=digit;
           
         }
          nums[i] = sum; 
         i++;
       }
       int min =nums[0];
       for(int k:nums){
        if(k<min){
            min = k;
        }
       }
       return min;
    }
}