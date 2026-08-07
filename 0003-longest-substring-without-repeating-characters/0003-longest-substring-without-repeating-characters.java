class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int right=0;
        int left=0;
        int count=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                count=Math.max(count,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}