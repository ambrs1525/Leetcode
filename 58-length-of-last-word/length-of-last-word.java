class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }

        return count;
    }
}