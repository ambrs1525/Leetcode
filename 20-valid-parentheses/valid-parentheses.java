class Solution {
    public boolean isValid(String s) {
        Customstack obj = new Customstack(s.length());
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                      obj.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                if(obj.isempty()){
                    return false;
                }
              char temp=  obj.pop();
              if(s.charAt(i)==')'&&temp!='('||s.charAt(i)==']'&&temp!='['||s.charAt(i)=='}'&&temp!='{'){
                return false;
              }
            }
        }
           boolean result=obj.isempty();
           return result;
        
    }
}


class Customstack{
    char[] stack  ;
    int top=0;
    Customstack(int size){
        stack = new char[size];
    }
    public void push(char data){
        stack[top] = data;
        top++;
    }
    public char pop(){
        char temp = stack[top-1];
        
        top--;
        return temp;

    }
    public boolean isempty(){
        if(top==0){
            return true;
        }
       return false;
    }
   

}