class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum = requests[0];
        int len = requests.length;
        for(int i =0;i<len-1;i++){
            sum +=Math.abs(requests[i]-requests[i+1]);
        }
        return sum;
    }
}