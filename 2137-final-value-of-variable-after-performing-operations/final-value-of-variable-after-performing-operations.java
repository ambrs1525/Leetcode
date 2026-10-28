class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val =0;
        for(int i  =0;i<operations.length;i++){
            String ch = operations[i];
            if(ch.equals("++X")||ch.equals("X++")){
                val= val+1;
            }
            else if(ch.equals("--X")||ch.equals("X--")){
                val = val-1;
            }
            
        }
        return val;

    }
}