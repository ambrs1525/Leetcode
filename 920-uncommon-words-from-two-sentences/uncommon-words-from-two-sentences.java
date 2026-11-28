class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String,Integer>map = new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i =0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        ArrayList<String>list=new  ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
              String key = entry.getKey();
              int val = entry.getValue();
              if(val == 1){
                list.add(key);
              }
        }
        return list.toArray(new String[0]);
    }
}