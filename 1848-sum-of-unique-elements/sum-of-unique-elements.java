class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer>map =new HashMap<>();
        int sum=0;
        for(int i =0;i<nums.length;i++){
            map. put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry <Integer, Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val==1){
                sum+=key;
            }
        }
        return sum;
    }
}