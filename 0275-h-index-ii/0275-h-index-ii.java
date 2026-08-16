class Solution {
    public int hIndex(int[] citations) {
        int left=0;
        int right=citations.length;
        int h=0;
        // if(citations.length==1) return citations[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]>=mid){
                    count++;
                }
            }
            if(count>=mid){
                h=Math.max(h,mid);
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return h;
    }
}