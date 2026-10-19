class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer>ans = new ArrayList<>();
        int low =0;
        int high= nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                int temp = mid;
               
                while (temp >= 0 && nums[temp] == target) {
                    ans.add(temp);
                    temp--;
                }
               
                temp = mid + 1;
                while (temp < nums.length && nums[temp] == target) {
                    ans.add(temp);
                    temp++;
                }
                break; 
              
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        Collections.sort(ans);
        return ans;
    }
}