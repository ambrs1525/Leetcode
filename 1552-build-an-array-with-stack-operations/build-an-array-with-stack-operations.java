class Solution {
    public List<String> buildArray(int[] target, int n) {
       List<String>ans = new ArrayList<>();
        //Stack<Integer>s = new Stack<>();
        int j =0;
        for(int i =1;i<=n&&j<target.length;i++){
             ans.add("Push");
            if(i==target[j]){
               // s.push(i);
               
               j++;
            }
            else{
              //  s.pop();
                ans.add("Pop");
            }
        }
        return ans;
    }
}