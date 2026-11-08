class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
       int round =0;
        for(Integer n:map.values()){
            if(n==1){
                return -1;
            }
            else{
                round +=(n+2)/3;
            }
        }
        return round;

    }
}