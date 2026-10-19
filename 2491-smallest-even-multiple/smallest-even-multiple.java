class Solution {
    public int smallestEvenMultiple(int n) {
        int range = 2*n;
        if(n%2!=0){
            return range;
        }
        int multiple = range;
        
        for(int i =1;i<=range;i++){
              if(i%n==0&&i%2==0){
                multiple = Math.min(multiple,i);
              }
        }
        
        return multiple;
    }
}