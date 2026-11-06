class Solution {
    public int countElements(int[] nums) {
        int max=nums[0];
        int min= nums[0];
        int count=0;
        for(int n:nums){
            if(n>max){
                max=n;
            }
        }
        for(int n:nums){
            if(n<min){
                min=n;
            }
        }
        for(int i=0;i<nums.length;i++){
            
       if(nums[i]<max&&nums[i]>min){
           count++;
       }
       
       }
       return count;
    }
}