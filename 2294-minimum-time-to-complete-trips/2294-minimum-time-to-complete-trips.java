class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=0;
        long right=(long)time[0]*totalTrips;
        long count=Long.MAX_VALUE;
        while(left<=right){
            long mid=left+(right-left)/2;
            long sum=0;
            for(int i=0;i<time.length;i++){
                sum+=mid/(long)time[i];
            }
            if(sum>=totalTrips){
                count=Math.min(count,mid);
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return count;
    }
}