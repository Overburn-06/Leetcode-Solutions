class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left=1;
        long right=0;
        for (int rank : ranks) {
            right = Math.max(right, (long) rank);
        }
        right *= (long)cars*cars;
        long time=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(isPossible(ranks,cars,mid)){
                time=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return time;
    }
    boolean isPossible(int []ranks,int cars,long mid){
        long count=0;
        for(int i=0;i<ranks.length;i++){
            count+=Math.sqrt(mid/ranks[i]);
        }
        if(count>=cars) return true;
        return false;
    }
}