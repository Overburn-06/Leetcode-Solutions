class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left=1;
        int right=0;
        for(int i=0;i<quantities.length;i++){
            right=Math.max(right,quantities[i]);
        }
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=isPossible(quantities,n,mid);
            if(count<=n){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
    int isPossible(int []quantities,int n,int mid){
        int count=0;
        for(int i=0;i<quantities.length;i++){
            count+=quantities[i]/mid;
            if(quantities[i]%mid!=0){
                count++;
            }
        }
        
        return count;
    }
}