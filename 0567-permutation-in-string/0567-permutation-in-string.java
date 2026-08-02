class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i=0;
        int j=s1.length()-1;
      
        HashMap<Character,Integer>set1=new HashMap<>();
        for(int z=0;z<s1.length();z++){
            char ch=s1.charAt(z);
            if(set1.containsKey(ch)){
                set1.put(ch,set1.get(ch)+1);
            }else{
                set1.put(ch,1);
            }
        }
        
        while(j<s2.length()){
            HashMap<Character,Integer>set2=new HashMap<>();
            for(int z=i;z<=j;z++){
                char c=s2.charAt(z);
                if(set2.containsKey(c)){
                set2.put(c,set2.get(c)+1);
            }else{
                set2.put(c,1);
            }
            }
            if(set1.equals(set2)) return true;
            i=i+1;
            j=j+1;
        }
        return false;
    }
}