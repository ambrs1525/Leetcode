class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(Integer n:map.values()){
            list.add(n);
        }
     
        int max = list.get(0);
      for(int i = 0; i < list.size(); i++){
        max = Math.max(max, list.get(i));
     }

   int sum = 0;

    for(int i = 0; i < list.size(); i++){
    if(list.get(i) == max){
        sum += list.get(i);
       }
    }
        return sum;
    }
}