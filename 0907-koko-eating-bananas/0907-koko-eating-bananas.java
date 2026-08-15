class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k=Integer.MAX_VALUE;
        int left=1;
        int right=0;
        for(int i:piles){
            right=Math.max(right,i);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    sum++;
                }
            }
            if(sum<=h){
                k=Math.min(k,mid);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return k;
    }
}