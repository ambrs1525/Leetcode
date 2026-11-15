class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int[]prefix = new int[n];
        prefix[0]=nums[0];
        for(int i =1;i<nums.length;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        for(int i =0;i<prefix.length;i++){
            prefix[i] = ((prefix[i]%k)+k)%k;
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<prefix.length;i++){
            map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
        }
        long count =0;
        for(Integer i:map.values()){
           count +=(long)(i*(i-1))/2;
        }
        return (int)count;
    }
}