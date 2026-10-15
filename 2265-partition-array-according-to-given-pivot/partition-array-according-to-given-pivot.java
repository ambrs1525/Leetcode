
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                l1.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                l1.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                l2.add(nums[i]);
            }
        }

        int k = 0;

        for (int i = 0; i < l1.size(); i++) {
            nums[k++] = l1.get(i);
        }

        for (int i = 0; i < l2.size(); i++) {
            nums[k++] = l2.get(i);
        }

        return nums;
    }
}
