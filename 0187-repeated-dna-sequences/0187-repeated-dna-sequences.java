class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
          List<String>res=new ArrayList<>();
          HashMap<String,Integer>map=new HashMap<>();
          HashSet<String>set=new HashSet<>();
          int left=0;
          int right=10;
          while(right<=s.length()){
            String sb=s.substring(left,right);
            map.put(sb,map.getOrDefault(sb,0)+1);
            if(map.get(sb)==2){
                set.add(sb.toString());
            }
            left++;
            right++;
          }
          for(String st:set){
            res.add(st);
          }
          return res;
    }
}