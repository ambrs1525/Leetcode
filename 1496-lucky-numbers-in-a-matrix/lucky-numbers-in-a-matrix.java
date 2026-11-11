
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> Lucky = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == min) {
                    int max = matrix[0][j];

                    for (int k = 0; k < m; k++) {
                        if (matrix[k][j] > max) {
                            max = matrix[k][j];
                        }
                    }

                    if (matrix[i][j] == max) {
                        Lucky.add(matrix[i][j]);
                    }
                }
            }
        }
        return Lucky;
    }
}
