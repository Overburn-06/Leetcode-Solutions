class Solution {
    public int candy(int[] ratings) {
        int []left_candy=new int[ratings.length];
        int []right_candy=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            left_candy[i]=1;
            right_candy[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                left_candy[i]=Math.max(left_candy[i],left_candy[i-1]+1);
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right_candy[i]=Math.max(right_candy[i+1]+1,right_candy[i]);
            }
        }
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            sum+=Math.max(left_candy[i],right_candy[i]);
        }
        return sum;
    }
}