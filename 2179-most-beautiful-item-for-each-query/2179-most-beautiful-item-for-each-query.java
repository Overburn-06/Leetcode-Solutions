class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int []res=new int[queries.length];
        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));
        int maxi=0;
        for(int i=0;i<items.length;i++){
            maxi=Math.max(items[i][1],maxi);
            items[i][1]=maxi;
        }
        for(int i=0;i<queries.length;i++){
            int left=0;
            int maxx=0;
            int right=items.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(items[mid][0]<=queries[i]){
                   maxx=Math.max(items[mid][1],maxx);
                   left=mid+1; 
                }
                else{
                    right=mid-1;
                }
            }
            res[i]=maxx;
        }
        return res;
    }
}