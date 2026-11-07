class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(val>1){
              list.add(key);
            }
        }
        return list;
    }
}