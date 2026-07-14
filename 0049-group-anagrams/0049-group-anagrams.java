class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        HashMap<String,List<String>>set=new HashMap<>();
        List<String>ls=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char []ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(set.containsKey(st)){
                set.get(st).add(strs[i]);
            }else{
                List<String>temp=new ArrayList<>();
                temp.add(strs[i]);
                set.put(st,temp);
                ls.add(st);
            }
            
        }
        for(int i=0;i<ls.size();i++){
            res.add(set.get(ls.get(i)));
        }
        return res;
    }
}