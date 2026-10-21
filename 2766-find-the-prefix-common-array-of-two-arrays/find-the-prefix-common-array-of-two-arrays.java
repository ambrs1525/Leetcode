class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        Set<Integer> s=new HashSet<>();
        int [] ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!s.add(A[i])) count++;
            if(!s.add(B[i])) count++;
            ans[i]=count;
        }
        return ans;
        
    }
}