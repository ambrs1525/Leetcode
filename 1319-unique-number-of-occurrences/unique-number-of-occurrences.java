class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp1 = new HashMap<>();
        for(int i =0;i<arr.length;i++){//inserting the key as elemnt of array and value as ocurrence of element in array.
            mp1.put(arr[i],mp1.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>li = new ArrayList<>();
        for(Integer n:mp1.values()){
            li.add(n);
        }
        Collections.sort(li);
        for(int i =0;i<li.size()-1;i++){
            if(li.get(i).equals(li.get(i+1))){
                 return false;
            }
        }
      return true;

    }
}