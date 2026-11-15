class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans = new int[2];
        int k =0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)&&map.get(comp)!=i){
                  ans[k]=i;
                  k++;
                  ans[k] = map.get(comp);
                return ans;
            }
    }
    return ans;

    }
}