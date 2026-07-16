class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int []prefix=new int[words.length];
        int count=0;
        String vowel="aeiou";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(vowel.indexOf(s.charAt(0))!=-1 && vowel.indexOf(s.charAt(s.length()-1))!=-1){
                count+=1;
            }
            prefix[i]=count;
        }
        int ans[]=new int[queries.length];
        int j=0;
        for(int i=0;i<queries.length;i++){
            int []temp=queries[i];
            int l=temp[0];
            int r=temp[1];
            if(l==0){
                ans[i]=prefix[r];
            }else{
                ans[i]=prefix[r]-prefix[l-1];
            }
        }
        return ans;
    }
}