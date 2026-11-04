class Solution {
    public int max(int [][]mat,int r,int c,int mid){
        int max_val=0;
        int index=-1;
        for(int i=0;i<c;i++){
            if(mat[mid][i]>max_val){
                max_val=mat[mid][i];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int low=0;
        int high=r-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max_num_col=max(mat,r,c,mid);
            int up=mid-1>=0 ? mat[mid-1][max_num_col]:-1;
            int down=mid+1<r ? mat[mid+1][max_num_col]:-1;
            if(mat[mid][max_num_col]>up&& mat[mid][max_num_col]>down) return new int[]{mid,max_num_col};
            else if(mat[mid][max_num_col]>up && mat[mid][max_num_col]<down) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}