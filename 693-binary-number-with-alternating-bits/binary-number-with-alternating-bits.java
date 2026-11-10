class Solution {
    public boolean hasAlternatingBits(int n) {
         String binary = Integer.toBinaryString(n);

        int prev = -1;

        for (int i = 0; i < binary.length(); i++) {
            int digit = binary.charAt(i) - '0';

            if (digit == prev) {
                return false;
            }

            prev = digit;
        }

        return true;
    }
}