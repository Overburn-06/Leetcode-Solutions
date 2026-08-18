class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=1;
        int right=0;
        for(int i=0;i<candies.length;i++){
            right=Math.max(right,candies[i]);
        }
        int count=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long c=0;
            for(int i=0;i<candies.length;i++){
                c+=candies[i]/mid;
            }
            if(c>=k){
                count=Math.max(count,mid);
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return count;
    }
}