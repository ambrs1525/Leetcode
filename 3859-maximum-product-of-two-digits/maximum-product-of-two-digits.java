class Solution {
    public int maxProduct(int n) {
        int count = 0;
        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int[] arr = new int[count];
        int temp2 = n;
        int i = 0;
        int digit = 0;
        int product = 0;
        int maxproduct = 0;

        while (temp2 != 0) {
            digit = temp2 % 10;
            temp2 = temp2 / 10;
            arr[i] = digit;
            i++;
        }

        for (int j = 0; j < count; j++) {
           for(int k =j+1;k<count;k++){
            product = arr[j]*arr[k];
            maxproduct = Math.max(maxproduct,product);
           }
        }

        return maxproduct;
    }
}