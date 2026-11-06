class Solution {
    public int reverse(int num){
        int temp = num;
        int digit =0;
        int sum=0;
        while(temp!=0){
           digit = temp%10;
           temp=temp/10;
           sum = sum*10+digit;
        }
        return sum;

    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int rev = reverse(nums[i]);
            int val = nums[i]-rev;
            map.put(val,map.getOrDefault(val,0)+1);
        }
        ArrayList<Integer>li = new ArrayList<>();
        long sum =0;
        for(Integer n:map.values()){
            sum = (sum + (long)n * (n - 1) / 2) % 1000000007;
        }
        
        return (int)sum;
       

    }
}