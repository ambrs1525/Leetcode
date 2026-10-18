class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer>li = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entery:map.entrySet()){
               int key = entery.getKey();
               int value = entery.getValue();
               if(value>n/3){
                    li.add(key);
               }
        }
        return li;

        
    }
}