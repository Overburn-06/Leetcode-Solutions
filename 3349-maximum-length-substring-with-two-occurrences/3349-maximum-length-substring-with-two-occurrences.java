class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>2){
                while(s.charAt(left)!=ch){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            if(map.get(ch)<=2){
                count=Math.max(count,right-left+1);
            }
            right++;
        }
        return count;
    }
}