class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
      int count=0;
        for(int i =0;i<nums.length;i++){
            int comp = nums[i]+k;
            int comp1=nums[i]-k;
           count+= map.getOrDefault(comp,0);
           count+= map.getOrDefault(comp1,0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
       
        return count;
    }
}