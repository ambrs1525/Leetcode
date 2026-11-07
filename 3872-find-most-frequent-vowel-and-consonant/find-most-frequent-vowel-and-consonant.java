class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        HashMap<Character,Integer>map1 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
        }
        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        for(Integer n:map.values()){
            l1.add(n);
        }
        for(Integer n:map1.values()){
            l2.add(n);
        }
      int max1 = 0;
      int max2 = 0;
      int sum =0;
     for(int i=0;i<l1.size();i++){
        if(l1.get(i)>max1){
            max1 = l1.get(i);
        }
     }
      for(int i=0;i<l2.size();i++){
        if(l2.get(i)>max2){
            max2 = l2.get(i);
        }
     }
      sum = max1+max2;
      return sum;
    }
}