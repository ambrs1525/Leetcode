class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s = new Stack<>();
       for(int i =0;i<operations.length;i++){
          if(!operations[i].equals("C")&&!operations[i].equals("D")&&!operations[i].equals("+")){
            s.push(Integer.parseInt(operations[i]));
          }
          else if(operations[i].equals("C")){
            s.pop();
          }
          else if(operations[i].equals("D")){
            s.push(s.peek()*2);
          }
          else if(operations[i].equals("+")){
            int n = s.size();
            s.push(s.get(n-1)+s.get(n-2));
          }
       }
       int sum =0;
       while(!s.empty()){
        sum+=s.pop();
       }
       return sum;
       

    }
}