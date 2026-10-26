class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer>s = new Stack<>();
      
       for(int i =0;i<tokens.length;i++){
        if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")){
            s.push(Integer.parseInt(tokens[i]));
        }
        else{
        int b = s.pop();
        int a = s.pop();
         int result = 0;
        if(tokens[i].equals("+")){
             result = a+b;
        }
        else if(tokens[i].equals("-")){
            result = a-b;
        }
        else if(tokens[i].equals("*")){
            result = a*b;
        }
        else if(tokens[i].equals("/")){
            result = a/b;
        }
        s.push(result);
        }

       }
       return s.pop();
    }
}