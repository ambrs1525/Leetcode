class Solution {
    public int numOfSubarrays(int[] arr) {
         HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;
        int MOD = 1000000007;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum % 2;

            if (rem < 0) {
                rem += 2;
            }

            if (rem == 0) {
                count += map.getOrDefault(1, 0);
            } else {
                count += map.getOrDefault(0, 0);
            }

            count %= MOD;

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}