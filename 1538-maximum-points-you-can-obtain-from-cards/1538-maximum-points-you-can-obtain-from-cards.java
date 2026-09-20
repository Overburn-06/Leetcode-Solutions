class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int j=0;
        int []prefix=new int[cardPoints.length];
        for(int i:cardPoints){
            sum+=i;
            prefix[j++]=sum;
        }
        if(k==cardPoints.length){
            return sum;
        }
        int left=0;
        int right=cardPoints.length-k-1;
        int maxpoints=0;
        while(right<cardPoints.length){
            int t=prefix[right]-prefix[left]+cardPoints[left];
            maxpoints=Math.max(maxpoints,sum-t);
            left++;
            right++;
        }
        return maxpoints;
    }
}