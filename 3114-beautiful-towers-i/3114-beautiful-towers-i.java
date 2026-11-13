class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long res=0;
        for(int i=0;i<heights.length;i++){
            long max_sum=0;
            long min=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--){
                min=Math.min(min,heights[j]);
                max_sum+=min;
            }
            min=Integer.MAX_VALUE;
            for(int j=i+1;j<heights.length;j++){
                min=Math.min(min,heights[j]);
                max_sum+=min;
            }
            res=Math.max(res,max_sum);
        }
        return res;
    }
}