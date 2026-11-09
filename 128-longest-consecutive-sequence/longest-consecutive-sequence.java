class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer>set = new TreeSet<>();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer n:set){
            list.add(n);
        }
        int i =0;
        int j= 1;
        int count =1;
        int max =1;
        while(j<list.size()){
            if(list.get(j)-list.get(i)==1){
                count++;
                max = Math.max(max,count);
            }
            else{
               count =1;
            }
            i++;
                j++;
        }
        if(list.size() == 0) return 0;
        return max;
        
    }
}