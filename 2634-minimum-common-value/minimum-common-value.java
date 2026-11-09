class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer>set = new HashSet<>();
       for(int i=0;i<nums1.length;i++){
        if(!set.contains(nums1[i]))set.add(nums1[i]);
       }
       ArrayList<Integer>list = new ArrayList<>();
       for(int i =0;i<nums2.length;i++){
        if(set.contains(nums2[i])){
            list.add(nums2[i]);
        }
    
       }
         if(list.size()==0) return -1;
       int min =list.get(0);
       for(int i =0;i<list.size();i++){
        if(list.get(i)<min){
            min = list.get(i);
        }
       }
       return min;

    }
}