class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }

        int bit = xor & (-xor);

        int a = 0, b = 0;

        for (int num : nums) {
            if ((num & bit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}