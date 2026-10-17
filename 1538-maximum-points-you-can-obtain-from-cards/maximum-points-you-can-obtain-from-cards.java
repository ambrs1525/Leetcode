class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int sum =0;
        int n = cardPoints.length;
        int totalsum = 0;
        for(int i =0;i<cardPoints.length;i++){
            totalsum +=cardPoints[i];
        }
        for(int i =0;i<n-k;i++){
              sum+=cardPoints[i];

        }
        int minsum  = sum;
        for(int i =n-k;i<cardPoints.length;i++){
            sum +=cardPoints[i];
            sum -= cardPoints[i-(n-k)];
            minsum = Math.min(minsum,sum);
        }
        return totalsum-minsum;

    }
}