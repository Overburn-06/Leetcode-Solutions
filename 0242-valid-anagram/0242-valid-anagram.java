class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>set1=new HashMap<>();
        HashMap<Character,Integer>set2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(set1.containsKey(s.charAt(i))){
                set1.put(s.charAt(i),set1.get(s.charAt(i))+1);
            }
            else{
                set1.put(s.charAt(i),1);
            }
            if(set2.containsKey(t.charAt(i))){
                set2.put(t.charAt(i),set2.get(t.charAt(i))+1);
            }
            else{
                set2.put(t.charAt(i),1);
            }
        }
        if(set1.equals(set2)) return true;
        return false;
        
    }
}