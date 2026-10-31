class Solution {
    public int candy(int[] ratings) {
        int i=1;
        int n=ratings.length;
        int sum=n;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int peak=0;
            while(ratings[i]>ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
                if(i==n) return sum;
            }
            int dip=0;
            while(i<n && ratings[i]<ratings[i-1]){
                dip++;
                sum+=dip;
                i++;
            }
            sum-=Math.min(dip,peak);
        }
        return sum;
    }
}