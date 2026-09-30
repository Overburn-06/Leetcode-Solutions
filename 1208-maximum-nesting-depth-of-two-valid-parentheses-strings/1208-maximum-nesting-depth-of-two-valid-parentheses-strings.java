class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int res[]=new int [seq.length()];
        int depth=0;
        int i=0;
        for(char ch:seq.toCharArray()){
            if(ch=='('){
                depth++;
                res[i++]=depth%2;
            }else{
                res[i++]=depth%2;
                depth--;
            }
        }
        return res;
    }
}